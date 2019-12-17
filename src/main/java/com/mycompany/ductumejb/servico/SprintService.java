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
public class SprintService extends Servico<Sprint> {

    @Override
    public Sprint criar() {
        return new Sprint();
    }
    
     @Override
    public void persistir(Sprint entidade) {
        entityManager.persist(entidade);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sprint atualizar(Sprint entidade) {
        entityManager.merge(entidade);
        entityManager.flush();
        return entidade;
    }

    public void remover(Sprint entidade) {
        entidade = entityManager.merge(entidade);
        entityManager.remove(entidade);

    }

   @TransactionAttribute(SUPPORTS)
    public List<Sprint> consultarEntidades() {
       return consultarEntidades( new Object[] {}, Sprint.ALL_SPRINTS);
    }
}
