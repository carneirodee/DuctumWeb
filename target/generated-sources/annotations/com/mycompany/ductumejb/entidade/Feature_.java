package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.entidade.Comment;
import com.mycompany.ductumejb.entidade.Employee;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-27T19:35:17")
@StaticMetamodel(Feature.class)
public class Feature_ { 

    public static volatile ListAttribute<Feature, Comment> comments;
    public static volatile SingularAttribute<Feature, Calendar> created;
    public static volatile SingularAttribute<Feature, Employee> responsible;
    public static volatile SingularAttribute<Feature, String> description;
    public static volatile SingularAttribute<Feature, Employee> reporter;
    public static volatile SingularAttribute<Feature, String> title;
    public static volatile SingularAttribute<Feature, Integer> points;

}