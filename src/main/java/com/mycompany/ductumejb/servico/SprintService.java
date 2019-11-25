/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ductumejb.servico;

import com.mycompany.ductumejb.entidade.Sprint;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

/**
 *
 * @author deecarneiro
 */
@Stateless
@LocalBean
@ValidateOnExecution(type = ExecutableType.ALL)
public class SprintService extends Servico<Sprint> {

    @Override
    public Sprint criar() {
        return new Sprint();
    }

    @Override
    protected List<Sprint> consultarEntidades(Object[] parametros, String nomeQuery) {
        return super.consultarEntidades(parametros, nomeQuery); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Sprint consultarEntidade(Object[] parametros, String nomeQuery) {
        return super.consultarEntidade(parametros, nomeQuery); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sprint consultarPorId(Long id) {
        return super.consultarPorId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sprint atualizar(Sprint entidade) {
        return super.atualizar(entidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void persistir(Sprint entidade) {
        super.persistir(entidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existe(Sprint entidade) {
        return super.existe(entidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setClasse(Class<Sprint> classe) {
        super.setClasse(classe); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
