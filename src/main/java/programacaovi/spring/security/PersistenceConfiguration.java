/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import static java.util.Arrays.asList;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Essa classe insere dois nomes, ao iniciar a aplicação, para fins de teste
 * @author rodrigo
 */
@Configuration
@EnableJpaRepositories
public class PersistenceConfiguration {
    @Autowired
    private PessoaRepository pessoaRepository;

    @PostConstruct
    private void addPersons() {
        Pessoa rodrigo = new Pessoa();
        rodrigo.setNome("Rodrigo");
        Pessoa monica = new Pessoa();
        monica.setNome("Monica");
        pessoaRepository.save(asList(rodrigo, monica));
    }
}
