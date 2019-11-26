
package com.mycompany.ductumejb.servico;

import com.mycompany.ductumejb.entidade.Entidade;
import com.mycompany.ductumejb.entidade.Solicitation;
import com.mycompany.ductumejb.typeenum.TypeSolicitation;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import static javax.ejb.TransactionAttributeType.SUPPORTS;
import javax.persistence.TypedQuery;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

/**
 *
 * @author deecarneiro
 */

@Stateless
@LocalBean
@ValidateOnExecution(type = ExecutableType.ALL)
public class SolicitationService extends Servico<Solicitation> {

    @TransactionAttribute(SUPPORTS)
    public List<Solicitation> consultarEntidades() {
       return consultarEntidades( new Object[] {}, Solicitation.ALL_SOLICITATIONS);
    }  

    @Override
    public Solicitation criar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}