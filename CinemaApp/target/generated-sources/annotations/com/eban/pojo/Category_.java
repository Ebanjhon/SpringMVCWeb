package com.eban.pojo;

import com.eban.pojo.CategoryFilm;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2024-04-12T22:35:40")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SetAttribute<Category, CategoryFilm> categoryFilmSet;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, Integer> categoryId;

}