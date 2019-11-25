

package Entity.jpqlTest;

import Entity.ValidatorTest.GenericTest;
import com.mycompany.ductumejb.entidade.Solicitation;
import com.mycompany.ductumejb.typeenum.StatusSolicitation;
import com.mycompany.ductumejb.typeenum.TypeSolicitation;
import java.util.List;
import javax.persistence.TypedQuery;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Deyse
 */
public class SolicitationJPQLTest extends GenericTest {
    
    
    @Test
    public void allSolicitation(){
        logger.info("Running allSolicitation()");
        TypedQuery<Solicitation> query = em.createQuery(
        "SELECT s FROM Solicitation s",
        Solicitation.class
        );
        
        List<Solicitation> solicitations = query.getResultList();
        
            for (Solicitation solicitation : solicitations){
                System.out.println(solicitation);
            }
            assertEquals(6, solicitations.size());  
        
    }
    
    @Test 
    public void solicitationByName(){
        logger.info("Running solicitationByName()");
        TypedQuery<Solicitation> query = em.createQuery(
        "SELECT s FROM Solicitation s WHERE s.name LIKE :name",
        Solicitation.class
        );
        query.setParameter("name","TESTE");
        
        Solicitation solicitation = query.getSingleResult();
        System.out.println(solicitation);
        assertNotNull(solicitation);
        
    }
    
    @Test
    public void solicitationByType(){
        logger.info("Running solicitationByType");
        TypedQuery<Solicitation> query = em.createQuery(
        "SELECT s FROM Solicitation s WHERE s.type LIKE :type",
        Solicitation.class
        );
        query.setParameter("type", TypeSolicitation.NEW_FEATURE);
        
        List<Solicitation> solicitations = query.getResultList();
        
            for (Solicitation solicitation : solicitations){
               System.out.println(solicitation);
            }
        
        assertEquals(3,solicitations.size());
    }
    
    @Test
    public void solicitationByStatus(){
        logger.info("Running solicitationByStatus");
        TypedQuery<Solicitation> query = em.createQuery(
        "SELECT s FROM Solicitation s WHERE s.status LIKE :status",
         Solicitation.class
        );
        query.setParameter("status", StatusSolicitation.DONE);
        
        List<Solicitation> solicitations = query.getResultList();
        
            for (Solicitation solicitation : solicitations){
                System.out.println(solicitation);
            }
            
            assertEquals(2, solicitations.size());
    }
    
    @Test
    public void solicitationByDescription(){
        logger.info("Running solicitationByDescription");
        TypedQuery<Solicitation> query = em.createQuery(
        "SELECT s FROM Solicitation s WHERE s.description LIKE CONCAT(:description, '%')",
         Solicitation.class
        );
        query.setParameter("description","Ao");
        
        List<Solicitation> solicitations = query.getResultList();
        
            for (Solicitation solicitation : solicitations){
               assertTrue(solicitation.getDescription().startsWith("Ao"));
                System.out.println(solicitation);
            }
            
            assertEquals(3, solicitations.size());
    }

 
}
