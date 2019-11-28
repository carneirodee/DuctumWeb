package com.mycompany.ductumejb.bean;

import com.mycompany.ductumejb.entidade.Project;
import com.mycompany.ductumejb.servico.ProjectService;
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
@Named(value="projectBean")
@ApplicationScoped
public class ProjectBean{
    

    @EJB
    private ProjectService serviceProject;
    private Project project = new Project();
    List<Project> lista = new ArrayList<>();
    
    public void iniciarCampos() {
      serviceProject.criar();
    }

    public boolean salvar(Project entidade) {
    entidade.setId(Long.MIN_VALUE);
        serviceProject.persistir(entidade);
        return true;
    }

    public List<Project> getLista() {
        lista = serviceProject.consultarEntidades();
        return lista;
    }

    public void setLista(List<Project> lista) {
        this.lista = lista;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    

}
