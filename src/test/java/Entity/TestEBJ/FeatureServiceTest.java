package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Feature;
import com.mycompany.ductumejb.servico.FeatureService;


public class FeatureServiceTest extends Teste{
    
    private FeatureService featureServico;
   

    @Before
    public void setUp() throws NamingException {
        featureServico = (FeatureService) container.getContext().lookup("java:global/classes/FeatureService!com.mycompany.ductumejb.servico.FeatureService");
    }

    @After
    public void tearDown() {
        featureServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(3, featureServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Feature feature = new Feature();
//        feature.setName("Nome");
//        feature.setDescription("description");
//        featureServico.persistir(feature);
//        assertNotNull(feature);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
