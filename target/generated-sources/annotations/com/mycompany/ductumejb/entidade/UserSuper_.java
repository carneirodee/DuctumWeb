package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.typeenum.StatusUser;
import com.mycompany.ductumejb.typeenum.TypeUser;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-25T01:54:08")
@StaticMetamodel(UserSuper.class)
public abstract class UserSuper_ extends Entidade_ {

    public static volatile SingularAttribute<UserSuper, String> password;
    public static volatile SingularAttribute<UserSuper, String> name;
    public static volatile SingularAttribute<UserSuper, Long> id;
    public static volatile SingularAttribute<UserSuper, String> login;
    public static volatile SingularAttribute<UserSuper, TypeUser> type;
    public static volatile SingularAttribute<UserSuper, String> email;
    public static volatile SingularAttribute<UserSuper, StatusUser> status;

}