package com.mycompany.ductumejb.entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author deecarneiro
 */

@Entity
@Table(name="TB_FEATURE") 
@NamedQueries(
        {
            @NamedQuery(
                    name = Feature.ALL_FEATURES,
                    query = "SELECT f FROM Feature f"
            )
        }
)
public class Feature extends Entidade implements Serializable {
    
    public static final String ALL_FEATURES = "All_Features";
  
    @NotBlank(message= "{Entity.Feature.title}")
    @Column(name = "title")
    private String title;
    
    @NotBlank(message = "{Entity.Feature.description}")
    @Column(name = "description")
    private String description;
    
    @NotNull(message = "{Entity.Feature.points}")
    @Column(name = "points")
    private int points;
    
    @ManyToOne
    @JoinColumn(name = "reporter")
    private Employee reporter;
    
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "responsible", referencedColumnName = "ID")
    private Employee responsible;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "feature_id")
    private List<Comment> comments;
    
    @Temporal(TemporalType.DATE)
    @Column(name="created")
    private Calendar created;
     

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Employee getReporter() {
        return reporter;
    }

    public void setReporter(Employee reporter) {
        this.reporter = reporter;
    }

    public Employee getResponsible() {
        return responsible;
    }

    public void setResponsible(Employee responsible) {
        this.responsible = responsible;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Calendar getCreated() {
        return created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }

}
