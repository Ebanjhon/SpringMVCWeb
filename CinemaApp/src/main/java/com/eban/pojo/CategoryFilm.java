/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eban.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "category_film")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryFilm.findAll", query = "SELECT c FROM CategoryFilm c"),
    @NamedQuery(name = "CategoryFilm.findByCategoryFilmId", query = "SELECT c FROM CategoryFilm c WHERE c.categoryFilmId = :categoryFilmId")})
public class CategoryFilm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_film_id")
    private Integer categoryFilmId;
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne
    private Category categoryId;
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    @ManyToOne
    private Film filmId;

    public CategoryFilm() {
    }

    public CategoryFilm(Integer categoryFilmId) {
        this.categoryFilmId = categoryFilmId;
    }

    public Integer getCategoryFilmId() {
        return categoryFilmId;
    }

    public void setCategoryFilmId(Integer categoryFilmId) {
        this.categoryFilmId = categoryFilmId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Film getFilmId() {
        return filmId;
    }

    public void setFilmId(Film filmId) {
        this.filmId = filmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryFilmId != null ? categoryFilmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryFilm)) {
            return false;
        }
        CategoryFilm other = (CategoryFilm) object;
        if ((this.categoryFilmId == null && other.categoryFilmId != null) || (this.categoryFilmId != null && !this.categoryFilmId.equals(other.categoryFilmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eban.pojo.CategoryFilm[ categoryFilmId=" + categoryFilmId + " ]";
    }
    
}
