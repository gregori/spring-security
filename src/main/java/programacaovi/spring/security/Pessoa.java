/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaovi.spring.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Classe entidade pessoa - note como não há qualquer método construtor ou getter
 * setter - a "mágica" é feita com a annotation @Data
 * @author rodrigo
 */
@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue
    private Long id;
    
    private String nome;
}
