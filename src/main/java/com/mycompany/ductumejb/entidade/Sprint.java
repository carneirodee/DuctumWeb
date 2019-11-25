/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ductumejb.entidade;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author deecarneiro
 */
@Entity
@Table(name="TB_SPRINT")
public class Sprint  extends Entidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    @Min( value= 1, message ="{Entity.Sprint.ident}")
    @Column(name = "identification")
    private int ident;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "sprint_id")
    private List<Feature> features;
    
    @ManyToOne
    @JoinColumn(name = "id_Project")
    private Project project;
    
    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    

   
    
    
    
}
