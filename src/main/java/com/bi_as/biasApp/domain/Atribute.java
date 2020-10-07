/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bi_as.biasApp.domain;

import java.io.Serializable;
import java.util.List;
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

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "atribute")
@NamedQueries({
        @NamedQuery(name = "Atribute.findAll", query = "SELECT a FROM Atribute a"),
        @NamedQuery(name = "Atribute.findByIdAtribute", query = "SELECT a FROM Atribute a WHERE a.idAtribute = :idAtribute"),
        @NamedQuery(name = "Atribute.findByDatos", query = "SELECT a FROM Atribute a WHERE a.datos = :datos"),
        @NamedQuery(name = "Atribute.findByTxUser", query = "SELECT a FROM Atribute a WHERE a.txUser = :txUser"),
        @NamedQuery(name = "Atribute.findByTxHost", query = "SELECT a FROM Atribute a WHERE a.txHost = :txHost"),
        @NamedQuery(name = "Atribute.findByTxDate", query = "SELECT a FROM Atribute a WHERE a.txDate = :txDate"),
        @NamedQuery(name = "Atribute.findByActive", query = "SELECT a FROM Atribute a WHERE a.active = :active")})
public class Atribute implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_atribute")
    private Integer idAtribute;
    @Basic(optional = false)
    @Column(name = "datos")
    private String datos;
    @Basic(optional = false)
    @Column(name = "tx_user")
    private String txUser;
    @Basic(optional = false)
    @Column(name = "tx_host")
    private String txHost;
    @Basic(optional = false)
    @Column(name = "tx_date")
    private String txDate;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atributeIdAtribute")
    private List<AtributeGraphic> atributeGraphicList;

    public Atribute() {
    }

    public Atribute(Integer idAtribute) {
        this.idAtribute = idAtribute;
    }

    public Atribute(Integer idAtribute, String datos, String txUser, String txHost, String txDate, int active) {
        this.idAtribute = idAtribute;
        this.datos = datos;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.active = active;
    }

    public Integer getIdAtribute() {
        return idAtribute;
    }

    public void setIdAtribute(Integer idAtribute) {
        this.idAtribute = idAtribute;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<AtributeGraphic> getAtributeGraphicList() {
        return atributeGraphicList;
    }

    public void setAtributeGraphicList(List<AtributeGraphic> atributeGraphicList) {
        this.atributeGraphicList = atributeGraphicList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtribute != null ? idAtribute.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atribute)) {
            return false;
        }
        Atribute other = (Atribute) object;
        if ((this.idAtribute == null && other.idAtribute != null) || (this.idAtribute != null && !this.idAtribute.equals(other.idAtribute))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Atribute[ idAtribute=" + idAtribute + " ]";
    }

}
