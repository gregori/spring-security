/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

/**
 * @author rodrigo
 */
@Component
@RepositoryEventHandler(Pessoa.class)
public class PessoaEventHandler {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @HandleBeforeSave
    public void checkPUTAuthority(Pessoa pessoa) {
        // somente para verificação de segurança
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @HandleBeforeCreate
    public void checkPOSTAuthority(Pessoa pessoa) {
        // somente para verificação de segurança
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @HandleBeforeDelete
    public void checkDELETEAuthority(Pessoa pessoa) {
        // somente para verificação de segurança
    }
}