/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author rodrigo
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // Adicionamos a tag @Param ao método para ser acessível via REST
    List<Pessoa> findByNomeLike(@Param("nome") String nome);
}