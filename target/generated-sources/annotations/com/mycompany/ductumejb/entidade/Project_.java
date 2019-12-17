package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.entidade.Client;
import com.mycompany.ductumejb.entidade.Employee;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-17T01:49:26")
@StaticMetamodel(Project.class)
public class Project_ extends Entidade_ {

    public static volatile SingularAttribute<Project, Calendar> beginDate;
    public static volatile SingularAttribute<Project, Employee> responsible;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, Client> client;
    public static volatile ListAttribute<Project, Employee> employees;
    public static volatile SingularAttribute<Project, Calendar> deadLine;

}