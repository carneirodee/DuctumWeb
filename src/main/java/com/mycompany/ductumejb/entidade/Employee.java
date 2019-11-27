
package com.mycompany.ductumejb.entidade;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Deyse
 */
@Entity
@Table(name="TB_EMPLOYEE") 
@DiscriminatorValue(value = "E")
@PrimaryKeyJoinColumn(name="ID_USER", referencedColumnName = "ID")
@NamedQueries(
        {
            @NamedQuery(
                    name = Employee.ALL_EMPLOYEES,
                    query = "SELECT e FROM Employee e"
            ),
             @NamedQuery(
                    name = Employee.PASS_AND_LOGIN,
                    query = "SELECT e FROM Employee e WHERE e.login = ?1 AND e.password = ?2"
            )
        }
)
public class Employee extends UserSuper implements Serializable {
    
    public static final String ALL_EMPLOYEES = "All_Employees";
    public static final String PASS_AND_LOGIN= "Employee_By_Pass";
    
    @CPF
    @NotNull
    private String cpf;
    
    
    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Employee[ id=" + id + " ]";
    }
    
}
