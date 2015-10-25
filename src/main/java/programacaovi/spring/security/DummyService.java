/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Serviço de teste para verificar se a injeção de dependência está ok
 * @author rodrigo
 */
@Service
public class DummyService {
    private final Logger logger = LoggerFactory.getLogger(DummyService.class);

    public String foo() {
        logger.debug("Foo foi chamado");
        return "bar";
    }
}
