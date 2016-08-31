/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appdenuncia.entidades;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author omar
 */


public class Denuncia implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idDenuncia;

    private String tipoDenuncia;

    private Date fechaDenuncia;

    private String direccion;

    private String descripcion;

    private String imagen;

    private Barrio idBarrio;

    private Ciudad idCiudad;

    private Departamento idDepartamento;

    private TipoEntidad idEntidad;
    
    

    private String correo;

    public Denuncia() {
        
    }

    public Denuncia(String idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public Denuncia(String idDenuncia, String tipoDenuncia, Date fechaDenuncia, String direccion, String descripcion, String imagen) {
        this.idDenuncia = idDenuncia;
        this.tipoDenuncia = tipoDenuncia;
        this.fechaDenuncia = fechaDenuncia;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(String idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public Date getFechaDenuncia() {
        return fechaDenuncia;
    }

    public void setFechaDenuncia(Date fechaDenuncia) {
        this.fechaDenuncia = fechaDenuncia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Barrio getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(Barrio idBarrio) {
        this.idBarrio = idBarrio;
    }

    public Ciudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public TipoEntidad getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(TipoEntidad idEntidad) {
        this.idEntidad = idEntidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDenuncia != null ? idDenuncia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Denuncia)) {
            return false;
        }
        Denuncia other = (Denuncia) object;
        if ((this.idDenuncia == null && other.idDenuncia != null) || (this.idDenuncia != null && !this.idDenuncia.equals(other.idDenuncia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appdenuncias.entidades.Denuncia[ idDenuncia=" + idDenuncia + " ]";
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
