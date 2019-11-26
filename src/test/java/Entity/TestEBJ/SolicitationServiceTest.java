package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Solicitation;
import com.mycompany.ductumejb.servico.SolicitationService;


public class SolicitationServiceTest extends Teste{
    
    private SolicitationService solicitationServico;
   

    @Before
    public void setUp() throws NamingException {
        solicitationServico = (SolicitationService) container.getContext().lookup("java:global/classes/SolicitationService!com.mycompany.ductumejb.servico.SolicitationService");
    }

    @After
    public void tearDown() {
        solicitationServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(6, solicitationServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Solicitation solicitation = new Solicitation();
//        solicitation.setName("Nome");
//        solicitation.setDescription("description");
//        solicitationServico.persistir(solicitation);
//        assertNotNull(solicitation);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
