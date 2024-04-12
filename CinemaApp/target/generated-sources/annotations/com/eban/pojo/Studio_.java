package com.eban.pojo;

import com.eban.pojo.Film;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-04-12T22:35:40")
@StaticMetamodel(Studio.class)
public class Studio_ { 

    public static volatile SingularAttribute<Studio, Integer> studioId;
    public static volatile SetAttribute<Studio, Film> filmSet;
    public static volatile SingularAttribute<Studio, String> studioName;

}