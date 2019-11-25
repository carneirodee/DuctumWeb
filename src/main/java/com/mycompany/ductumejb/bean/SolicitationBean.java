package com.mycompany.ductumejb.bean;

import com.mycompany.ductumejb.entidade.Solicitation;
import com.mycompany.ductumejb.servico.SolicitationService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author MASC
 */
@Named(value="solicitationBean")
@ApplicationScoped
public class SolicitationBean{
    

    @EJB
    private SolicitationService serviceSolicitation;
    List<Solicitation> lista = new ArrayList<>();
    
    public void iniciarCampos() {
      serviceSolicitation.criar();
    }

    public boolean salvar(Solicitation entidade) {
        serviceSolicitation.persistir(entidade);
        return true;
    }

    public List<Solicitation> getLista() {
        lista = serviceSolicitation.getSolicitations();
        return lista;
    }

    public void setLista(List<Solicitation> lista) {
        this.lista = lista;
    }
    

}
