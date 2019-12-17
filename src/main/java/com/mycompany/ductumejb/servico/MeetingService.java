/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ductumejb.servico;

import com.mycompany.ductumejb.entidade.Meeting;
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
public class MeetingService extends Servico<Meeting> {

    @Override
    public Meeting criar() {
       return new Meeting();
    }
     @Override
    public void persistir(Meeting entidade) {
        entityManager.persist(entidade);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Meeting atualizar(Meeting entidade) {
        entityManager.merge(entidade);
        entityManager.flush();
        return entidade;
    }

    public void remover(Meeting entidade) {
        entidade = entityManager.merge(entidade);
        entityManager.remove(entidade);

    }

    @TransactionAttribute(SUPPORTS)
    public List<Meeting> consultarEntidades() {
       return consultarEntidades( new Object[] {}, Meeting.ALL_MEETINGS);
    }
 
}
