package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Meeting;
import com.mycompany.ductumejb.servico.MeetingService;


public class MeetingServiceTest extends Teste{
    
    private MeetingService meetingServico;
   

    @Before
    public void setUp() throws NamingException {
        meetingServico = (MeetingService) container.getContext().lookup("java:global/classes/MeetingService!com.mycompany.ductumejb.servico.MeetingService");
    }

    @After
    public void tearDown() {
        meetingServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(3, meetingServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Meeting meeting = new Meeting();
//        meeting.setName("Nome");
//        meeting.setDescription("description");
//        meetingServico.persistir(meeting);
//        assertNotNull(meeting);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
