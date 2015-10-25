/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author rodrigo
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    @Override
    // Se o usuário for administrador, permite executar o método
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    Page<Pessoa> findAll(Pageable pageable);

    @Override
    // Se o nome do usuário fazendo a requisição for igual ao usuário ao qual se está
    // buscando, ou o usuário é um administrador, permite executar o método
    @PostAuthorize("returnObject.nome == principal.username or hasRole('ROLE_ADMIN')")
    Pessoa findOne(Long aLong);

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    // Se o usuário for administrador, permite executar o método
    List<Pessoa> findByNomeLike(@Param("nome") String nome);

    // Método usado apelas pelo FakeUserDetailsService, não é exportado na API REST
    @RestResource(exported = false)
    Pessoa findByNome(String nome);
}