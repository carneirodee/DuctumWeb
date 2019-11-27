package com.mycompany.ductumejb.bean;

import com.mycompany.ductumejb.entidade.Client;
import com.mycompany.ductumejb.entidade.Employee;
import com.mycompany.ductumejb.entidade.Solicitation;
import com.mycompany.ductumejb.servico.ClientService;
import com.mycompany.ductumejb.servico.EmployeeService;
import com.mycompany.ductumejb.servico.SolicitationService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MASC
 */
@Named
@SessionScoped
public class LoginBean implements Serializable{

    @EJB
    private ClientService serviceClient;
    private Client cliente = new Client();
   
    @EJB
    private EmployeeService serviceEmployee;
    private Employee employee= new Employee();
 
    public Client iniciarCampos() {
      return serviceClient.criar();
    }

    public String loginClient(String login, String senha) {
        cliente = serviceClient.consultarEntidade(senha, login);
        if(cliente != null){
                    System.out.println("LOGIN:"+login+" SENHA"+senha+"CLIENT"+cliente);

            return "solicitacoes";
        }
        System.out.println("LOGIN:"+login+" SENHA"+senha+"CLIENT"+cliente);
        return "index";
    }
    
    public String loginEmployee(String login, String senha) {
        employee = serviceEmployee.consultarEntidade(senha, login);
        if(employee != null){
            System.out.println("LOGIN:"+login+" SENHA"+senha+"CLIENT"+employee);

            return "listarProjetos";
        }
        System.out.println("LOGIN:"+login+" SENHA"+senha+"CLIENT"+employee);
        return "listarProjetos";
    }
 
    
    public String logout(){
              return "sair";
    }
}
