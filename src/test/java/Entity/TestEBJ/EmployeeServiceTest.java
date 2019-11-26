package Entity.TestEBJ;

import javax.naming.NamingException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static Entity.TestEBJ.Teste.container;
import com.mycompany.ductumejb.entidade.Employee;
import com.mycompany.ductumejb.servico.EmployeeService;


public class EmployeeServiceTest extends Teste{
    
    private EmployeeService employeeServico;
   

    @Before
    public void setUp() throws NamingException {
        employeeServico = (EmployeeService) container.getContext().lookup("java:global/classes/EmployeeService!com.mycompany.ductumejb.servico.EmployeeService");
    }

    @After
    public void tearDown() {
        employeeServico = null;
    }

    
    //Consultas
  
    
    @Test 
    public void consultarToddos(){
       assertEquals(8, employeeServico.consultarEntidades().size());
    }
   
    
//    @Test
//    public void persistir(){
//        Employee employee = new Employee();
//        employee.setName("Nome");
//        employee.setDescription("description");
//        employeeServico.persistir(employee);
//        assertNotNull(employee);
//    }
//    
  
    
    
    //Persistir, Atualziar e Remover  
    
    
}
