package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Project;
import com.mycompany.ductumejb.servico.ProjectService;


public class ProjectServiceTest extends Teste{
    
    private ProjectService projectServico;
   

    @Before
    public void setUp() throws NamingException {
        projectServico = (ProjectService) container.getContext().lookup("java:global/classes/ProjectService!com.mycompany.ductumejb.servico.ProjectService");
    }

    @After
    public void tearDown() {
        projectServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(7, projectServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Project project = new Project();
//        project.setName("Nome");
//        project.setDescription("description");
//        projectServico.persistir(project);
//        assertNotNull(project);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
