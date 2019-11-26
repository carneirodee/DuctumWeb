/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ductumejb.entidade;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author deecarneiro
 */
@Entity
@Table(name="TB_COMENT") 
@NamedQueries(
        {
            @NamedQuery(
                    name = Comment.ALL_COMMENTS,
                    query = "SELECT c FROM Comment c"
            )
        }
)
public class Comment extends Entidade implements Serializable {
    
    public static final String ALL_COMMENTS = "All_Comments";

    @NotBlank(message = "{Entity.Comment.content}")
    @Column(name = "content")
    private String content;
    
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "user", referencedColumnName = "ID")
    private Employee user;
   
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Employee getUser() {
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

   
}
