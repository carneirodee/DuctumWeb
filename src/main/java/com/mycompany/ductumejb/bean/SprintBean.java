package com.mycompany.ductumejb.bean;

import com.mycompany.ductumejb.entidade.Sprint;
import com.mycompany.ductumejb.servico.SprintService;
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
@Named(value="sprintBean")
@ApplicationScoped
public class SprintBean{
    

    @EJB
    private SprintService serviceSprint;
    private Sprint sprint = new Sprint();
    List<Sprint> lista = new ArrayList<>();
    
    public void iniciarCampos() {
      serviceSprint.criar();
    }

    public boolean salvar(Sprint entidade) {
    entidade.setId(Long.MIN_VALUE);
        serviceSprint.persistir(entidade);
        return true;
    }

    public List<Sprint> getLista() {
        lista = serviceSprint.consultarEntidades();
        return lista;
    }

    public void setLista(List<Sprint> lista) {
        this.lista = lista;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
    

}
