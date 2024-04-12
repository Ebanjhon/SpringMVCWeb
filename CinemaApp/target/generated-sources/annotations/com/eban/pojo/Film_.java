package com.eban.pojo;

import com.eban.pojo.CategoryFilm;
import com.eban.pojo.Studio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-04-12T22:35:40")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile SetAttribute<Film, CategoryFilm> categoryFilmSet;
    public static volatile SingularAttribute<Film, Studio> studioId;
    public static volatile SingularAttribute<Film, String> filmTitle;
    public static volatile SingularAttribute<Film, Integer> filmId;
    public static volatile SingularAttribute<Film, String> poster;
    public static volatile SingularAttribute<Film, String> clip;

}