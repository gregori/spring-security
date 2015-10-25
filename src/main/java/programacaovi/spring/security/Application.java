/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author rodrigo
 */
@SpringBootApplication
public class Application implements CommandLineRunner {
    
    // Objeto para escrever no console de log
    private final Logger logger = LoggerFactory.getLogger(Application.class);
   
    // Injeção, instância automática do objeto
    @Autowired
    private PessoaService pessoaService;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Pessoa> pessoas = pessoaService.findPessoasWithNomeLikeMo();
        logger.info("PessoaService retornou {}", pessoas);
    }
    
}
