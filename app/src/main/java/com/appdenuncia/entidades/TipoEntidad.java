/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appdenuncia.entidades;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author omar
 */

public class TipoEntidad implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idEntidad;

    private String nombreEntidad;

    private String tipo;
    private List<Denuncia> denunciaList;


    public TipoEntidad() {
    }

    public TipoEntidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    public TipoEntidad(String idEntidad, String nombreEntidad, String tipo) {
        this.idEntidad = idEntidad;
        this.nombreEntidad = nombreEntidad;
        this.tipo = tipo;
    }

    public String getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(String idEntidad) {
        this.idEntidad = idEntidad;
    }

    public String getNombreEntidad() {
        return nombreEntidad;
    }

    public void setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public List<Denuncia> getDenunciaList() {
        return denunciaList;
    }

    public void setDenunciaList(List<Denuncia> denunciaList) {
        this.denunciaList = denunciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntidad != null ? idEntidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEntidad)) {
            return false;
        }
        TipoEntidad other = (TipoEntidad) object;
        if ((this.idEntidad == null && other.idEntidad != null) || (this.idEntidad != null && !this.idEntidad.equals(other.idEntidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nombreEntidad;
    }
    
}
