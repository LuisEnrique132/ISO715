/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "editorial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Editorial.findAll", query = "SELECT e FROM Editorial e")
    , @NamedQuery(name = "Editorial.findById", query = "SELECT e FROM Editorial e WHERE e.id = :id")
    , @NamedQuery(name = "Editorial.findByEditorial", query = "SELECT e FROM Editorial e WHERE e.editorial = :editorial")
    , @NamedQuery(name = "Editorial.findByEstado", query = "SELECT e FROM Editorial e WHERE e.estado = :estado")})
public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "editorial")
    private String editorial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Editorial() {
    }

    public Editorial(Integer id) {
        this.id = id;
    }

    public Editorial(Integer id, String editorial, int estado) {
        this.id = id;
        this.editorial = editorial;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editorial)) {
            return false;
        }
        Editorial other = (Editorial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bd.entity.Editorial[ id=" + id + " ]";
    }
    
}
