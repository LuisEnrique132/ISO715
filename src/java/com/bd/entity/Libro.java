/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l")
    , @NamedQuery(name = "Libro.findById", query = "SELECT l FROM Libro l WHERE l.id = :id")
    , @NamedQuery(name = "Libro.findByCantidad", query = "SELECT l FROM Libro l WHERE l.cantidad = :cantidad")
    , @NamedQuery(name = "Libro.findByIdAutor", query = "SELECT l FROM Libro l WHERE l.idAutor = :idAutor")
    , @NamedQuery(name = "Libro.findByIdEditorial", query = "SELECT l FROM Libro l WHERE l.idEditorial = :idEditorial")
    , @NamedQuery(name = "Libro.findByAnioEdicion", query = "SELECT l FROM Libro l WHERE l.anioEdicion = :anioEdicion")
    , @NamedQuery(name = "Libro.findByIdMateria", query = "SELECT l FROM Libro l WHERE l.idMateria = :idMateria")
    , @NamedQuery(name = "Libro.findByNumPagina", query = "SELECT l FROM Libro l WHERE l.numPagina = :numPagina")
    , @NamedQuery(name = "Libro.findByImagen", query = "SELECT l FROM Libro l WHERE l.imagen = :imagen")
    , @NamedQuery(name = "Libro.findByEstado", query = "SELECT l FROM Libro l WHERE l.estado = :estado")})
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_autor")
    private int idAutor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_editorial")
    private int idEditorial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio_edicion")
    @Temporal(TemporalType.DATE)
    private Date anioEdicion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_materia")
    private int idMateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "num_pagina")
    private int numPagina;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Libro() {
    }

    public Libro(Integer id) {
        this.id = id;
    }

    public Libro(Integer id, String titulo, int cantidad, int idAutor, int idEditorial, Date anioEdicion, int idMateria, int numPagina, String descripcion, String imagen, int estado) {
        this.id = id;
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.idAutor = idAutor;
        this.idEditorial = idEditorial;
        this.anioEdicion = anioEdicion;
        this.idMateria = idMateria;
        this.numPagina = numPagina;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public Date getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(Date anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bd.entity.Libro[ id=" + id + " ]";
    }
    
}
