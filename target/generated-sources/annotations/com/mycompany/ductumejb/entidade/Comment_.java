package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.entidade.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-17T01:49:26")
@StaticMetamodel(Comment.class)
public class Comment_ extends Entidade_ {

    public static volatile SingularAttribute<Comment, Employee> user;
    public static volatile SingularAttribute<Comment, String> content;

}