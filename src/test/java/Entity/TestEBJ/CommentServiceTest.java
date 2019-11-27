package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Comment;
import com.mycompany.ductumejb.servico.CommentService;


public class CommentServiceTest extends Teste{
    
    private CommentService commentServico;
   

    @Before
    public void setUp() throws NamingException {
        commentServico = (CommentService) container.getContext().lookup("java:global/classes/CommentService!com.mycompany.ductumejb.servico.CommentService");
    }

    @After
    public void tearDown() {
        commentServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(2, commentServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Comment comment = new Comment();
//        comment.setName("Nome");
//        comment.setDescription("description");
//        commentServico.persistir(comment);
//        assertNotNull(comment);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
