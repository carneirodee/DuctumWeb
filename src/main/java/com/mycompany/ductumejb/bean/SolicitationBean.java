package com.mycompany.ductumejb.bean;

import com.mycompany.ductumejb.entidade.Solicitation;
import com.mycompany.ductumejb.servico.SolicitationService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.SUPPORTS;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author MASC
 */
@Named(value = "solicitationBean")
@ApplicationScoped
public class SolicitationBean {

    @EJB
    private SolicitationService serviceSolicitation;
    private Solicitation solicitation = new Solicitation();
    List<Solicitation> lista = new ArrayList<>();

    @Inject
    private LoginBean login;
    
    
    
    public void iniciarCampos() {
        serviceSolicitation.criar();
    }

    public void salvar() {

        System.out.println(solicitation.getName());
        serviceSolicitation.persistir(solicitation);
    }

    public List<Solicitation> getLista() {
        lista = serviceSolicitation.consultarEntidades();
        return lista;
    }

    @TransactionAttribute(SUPPORTS)
    public List<Solicitation> getListaPorCliente(Long id) {
        lista = serviceSolicitation.consultarPorCliente(id);
        System.out.print(lista.toString());
        return lista;
    }

    public void setLista(List<Solicitation> lista) {
        this.lista = lista;
    }

    public Solicitation getSolicitation() {
        return solicitation;
    }

    public void setSolicitation(Solicitation solicitation) {
        this.solicitation = solicitation;
    }

}
