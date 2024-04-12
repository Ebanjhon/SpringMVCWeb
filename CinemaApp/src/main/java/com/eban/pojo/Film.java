/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eban.pojo;

import java.io.Serializable;
import java.util.Set;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "film")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Film.findAll", query = "SELECT f FROM Film f"),
    @NamedQuery(name = "Film.findByFilmId", query = "SELECT f FROM Film f WHERE f.filmId = :filmId"),
    @NamedQuery(name = "Film.findByFilmTitle", query = "SELECT f FROM Film f WHERE f.filmTitle = :filmTitle"),
    @NamedQuery(name = "Film.findByPoster", query = "SELECT f FROM Film f WHERE f.poster = :poster"),
    @NamedQuery(name = "Film.findByClip", query = "SELECT f FROM Film f WHERE f.clip = :clip")})
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "film_id")
    private Integer filmId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "film_title")
    private String filmTitle;
    @Size(max = 255)
    @Column(name = "poster")
    private String poster;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "clip")
    private String clip;
    @OneToMany(mappedBy = "filmId")
    private Set<CategoryFilm> categoryFilmSet;
    @JoinColumn(name = "studio_id", referencedColumnName = "studio_id")
    @ManyToOne(optional = false)
    private Studio studioId;

    public Film() {
    }

    public Film(Integer filmId) {
        this.filmId = filmId;
    }

    public Film(Integer filmId, String filmTitle, String clip) {
        this.filmId = filmId;
        this.filmTitle = filmTitle;
        this.clip = clip;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getClip() {
        return clip;
    }

    public void setClip(String clip) {
        this.clip = clip;
    }

    @XmlTransient
    public Set<CategoryFilm> getCategoryFilmSet() {
        return categoryFilmSet;
    }

    public void setCategoryFilmSet(Set<CategoryFilm> categoryFilmSet) {
        this.categoryFilmSet = categoryFilmSet;
    }

    public Studio getStudioId() {
        return studioId;
    }

    public void setStudioId(Studio studioId) {
        this.studioId = studioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filmId != null ? filmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.filmId == null && other.filmId != null) || (this.filmId != null && !this.filmId.equals(other.filmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eban.pojo.Film[ filmId=" + filmId + " ]";
    }
    
}
