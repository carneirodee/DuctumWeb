/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ductumejb.servico;

import com.mycompany.ductumejb.entidade.Client;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.SUPPORTS;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

/**
 *
 * @author deecarneiro
 */
@Stateless
@LocalBean
@ValidateOnExecution(type = ExecutableType.ALL)
public class ClientService extends Servico<Client> {


    @TransactionAttribute(SUPPORTS)
    public List<Client> consultarEntidades() {
       return consultarEntidades( new Object[] {}, Client.ALL_CLIENTS);
    }

    @TransactionAttribute(SUPPORTS)
    public Client criar() {
        return new Client();
    }

    @TransactionAttribute(SUPPORTS)
    public Client consultarEntidade(String senha, String login) {
        return consultarEntidade( new Object[] {login,senha}, Client.PASS_AND_LOGIN); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
