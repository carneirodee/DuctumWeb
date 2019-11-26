package com.mycompany.ductumejb.entidade;

import com.mycompany.ductumejb.entidade.Sprint;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-26T16:02:44")
@StaticMetamodel(Meeting.class)
public class Meeting_ extends UserSuper_ {

    public static volatile SingularAttribute<Meeting, Date> timeMeeting;
    public static volatile SingularAttribute<Meeting, Sprint> sprint;
    public static volatile SingularAttribute<Meeting, String> description;
    public static volatile SingularAttribute<Meeting, String> title;
    public static volatile SingularAttribute<Meeting, Calendar> dateMeeting;

}