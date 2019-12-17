package com.mycompany.ductumejb.bean;

import com.mycompany.ductumejb.entidade.Meeting;
import com.mycompany.ductumejb.servico.MeetingService;
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
@Named(value="meetingBean")
@ApplicationScoped
public class MeetingBean{
    

    @EJB
    private MeetingService serviceMeeting;
    private Meeting meeting = new Meeting();
    List<Meeting> lista = new ArrayList<>();
    
    public void iniciarCampos() {
      serviceMeeting.criar();
    }

    public boolean salvar(Meeting entidade) {
        serviceMeeting.persistir(entidade);
        return true;
    }

    public List<Meeting> getLista() {
        lista = serviceMeeting.consultarEntidades();
        return lista;
    }

    public void setLista(List<Meeting> lista) {
        this.lista = lista;
    }

    public Meeting getMeeting() {
        return meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }
    

}
