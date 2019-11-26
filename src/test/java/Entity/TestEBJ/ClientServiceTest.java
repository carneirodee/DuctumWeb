package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Client;
import com.mycompany.ductumejb.servico.ClientService;


public class ClientServiceTest extends Teste{
    
    private ClientService clientServico;
   

    @Before
    public void setUp() throws NamingException {
        clientServico = (ClientService) container.getContext().lookup("java:global/classes/ClientService!com.mycompany.ductumejb.servico.ClientService");
    }

    @After
    public void tearDown() {
        clientServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(8, clientServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Client client = new Client();
//        client.setName("Nome");
//        client.setDescription("description");
//        clientServico.persistir(client);
//        assertNotNull(client);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
