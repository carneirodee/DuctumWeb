package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.entidade.Solicitation;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-25T01:54:09")
@StaticMetamodel(Client.class)
public class Client_ extends UserSuper_ {

    public static volatile SingularAttribute<Client, String> cnpj;
    public static volatile ListAttribute<Client, Solicitation> solicitations;

}