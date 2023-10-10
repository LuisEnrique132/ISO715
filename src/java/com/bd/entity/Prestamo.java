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
@Table(name = "prestamo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamo.findAll", query = "SELECT p FROM Prestamo p")
    , @NamedQuery(name = "Prestamo.findById", query = "SELECT p FROM Prestamo p WHERE p.id = :id")
    , @NamedQuery(name = "Prestamo.findByIdEstudiante", query = "SELECT p FROM Prestamo p WHERE p.idEstudiante = :idEstudiante")
    , @NamedQuery(name = "Prestamo.findByIdLibro", query = "SELECT p FROM Prestamo p WHERE p.idLibro = :idLibro")
    , @NamedQuery(name = "Prestamo.findByFechaPrestamo", query = "SELECT p FROM Prestamo p WHERE p.fechaPrestamo = :fechaPrestamo")
    , @NamedQuery(name = "Prestamo.findByFechaDevolucion", query = "SELECT p FROM Prestamo p WHERE p.fechaDevolucion = :fechaDevolucion")
    , @NamedQuery(name = "Prestamo.findByCantidad", query = "SELECT p FROM Prestamo p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Prestamo.findByEstado", query = "SELECT p FROM Prestamo p WHERE p.estado = :estado")})
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estudiante")
    private int idEstudiante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_libro")
    private int idLibro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_prestamo")
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "observacion")
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Prestamo() {
    }

    public Prestamo(Integer id) {
        this.id = id;
    }

    public Prestamo(Integer id, int idEstudiante, int idLibro, Date fechaPrestamo, Date fechaDevolucion, int cantidad, String observacion, int estado) {
        this.id = id;
        this.idEstudiante = idEstudiante;
        this.idLibro = idLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.cantidad = cantidad;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bd.entity.Prestamo[ id=" + id + " ]";
    }
    
}
