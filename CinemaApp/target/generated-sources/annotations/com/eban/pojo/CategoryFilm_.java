package com.eban.pojo;

import com.eban.pojo.Category;
import com.eban.pojo.Film;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-04-12T22:35:40")
@StaticMetamodel(CategoryFilm.class)
public class CategoryFilm_ { 

    public static volatile SingularAttribute<CategoryFilm, Film> filmId;
    public static volatile SingularAttribute<CategoryFilm, Category> categoryId;
    public static volatile SingularAttribute<CategoryFilm, Integer> categoryFilmId;

}