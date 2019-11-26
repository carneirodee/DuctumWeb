package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Sprint;
import com.mycompany.ductumejb.servico.SprintService;


public class SprintServiceTest extends Teste{
    
    private SprintService sprintServico;
   

    @Before
    public void setUp() throws NamingException {
        sprintServico = (SprintService) container.getContext().lookup("java:global/classes/SprintService!com.mycompany.ductumejb.servico.SprintService");
    }

    @After
    public void tearDown() {
        sprintServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(3, sprintServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Sprint sprint = new Sprint();
//        sprint.setName("Nome");
//        sprint.setDescription("description");
//        sprintServico.persistir(sprint);
//        assertNotNull(sprint);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
