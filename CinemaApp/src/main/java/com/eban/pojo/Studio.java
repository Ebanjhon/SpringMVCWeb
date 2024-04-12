/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eban.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "studio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studio.findAll", query = "SELECT s FROM Studio s"),
    @NamedQuery(name = "Studio.findByStudioId", query = "SELECT s FROM Studio s WHERE s.studioId = :studioId"),
    @NamedQuery(name = "Studio.findByStudioName", query = "SELECT s FROM Studio s WHERE s.studioName = :studioName")})
public class Studio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "studio_id")
    private Integer studioId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "studio_name")
    private String studioName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studioId")
    private Set<Film> filmSet;

    public Studio() {
    }

    public Studio(Integer studioId) {
        this.studioId = studioId;
    }

    public Studio(Integer studioId, String studioName) {
        this.studioId = studioId;
        this.studioName = studioName;
    }

    public Integer getStudioId() {
        return studioId;
    }

    public void setStudioId(Integer studioId) {
        this.studioId = studioId;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    @XmlTransient
    public Set<Film> getFilmSet() {
        return filmSet;
    }

    public void setFilmSet(Set<Film> filmSet) {
        this.filmSet = filmSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studioId != null ? studioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studio)) {
            return false;
        }
        Studio other = (Studio) object;
        if ((this.studioId == null && other.studioId != null) || (this.studioId != null && !this.studioId.equals(other.studioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.eban.pojo.Studio[ studioId=" + studioId + " ]";
    }
    
}
