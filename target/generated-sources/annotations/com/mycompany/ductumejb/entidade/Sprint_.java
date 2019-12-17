package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.entidade.Feature;
import com.mycompany.ductumejb.entidade.Project;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-17T01:49:26")
@StaticMetamodel(Sprint.class)
public class Sprint_ extends Entidade_ {

    public static volatile ListAttribute<Sprint, Feature> features;
    public static volatile SingularAttribute<Sprint, Integer> ident;
    public static volatile SingularAttribute<Sprint, Project> project;

}