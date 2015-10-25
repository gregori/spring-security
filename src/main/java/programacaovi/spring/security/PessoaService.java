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
import org.springframework.stereotype.Service;

/**
 *
 * @author rodrigo
 */
@Service
public class PessoaService {
    private final Logger logger = LoggerFactory.getLogger(PessoaService.class);

    @Autowired
    private PessoaRepository pessoaRepository;

    /**
     *
     * @return
     */
    public List<Pessoa> findPessoasWithNomeLikeMo() {
        logger.debug("findPessoasWithNomeLikeMo foi chamado");
        return pessoaRepository.findByNomeLike("%Mo%");
    }
}
