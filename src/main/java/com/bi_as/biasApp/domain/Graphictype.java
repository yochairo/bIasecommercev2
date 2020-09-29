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
@Table(name = "graphictype")
@NamedQueries({
    @NamedQuery(name = "Graphictype.findAll", query = "SELECT g FROM Graphictype g"),
    @NamedQuery(name = "Graphictype.findByIdGraphictype", query = "SELECT g FROM Graphictype g WHERE g.idGraphictype = :idGraphictype"),
    @NamedQuery(name = "Graphictype.findByName", query = "SELECT g FROM Graphictype g WHERE g.name = :name"),
    @NamedQuery(name = "Graphictype.findByActive", query = "SELECT g FROM Graphictype g WHERE g.active = :active")})
public class Graphictype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_graphictype")
    private Integer idGraphictype;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphicTypeidgraphictype")
    private List<Graphic> graphicList;

    public Graphictype() {
    }

    public Graphictype(Integer idGraphictype) {
        this.idGraphictype = idGraphictype;
    }

    public Graphictype(Integer idGraphictype, String name, int active) {
        this.idGraphictype = idGraphictype;
        this.name = name;
        this.active = active;
    }

    public Integer getIdGraphictype() {
        return idGraphictype;
    }

    public void setIdGraphictype(Integer idGraphictype) {
        this.idGraphictype = idGraphictype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<Graphic> getGraphicList() {
        return graphicList;
    }

    public void setGraphicList(List<Graphic> graphicList) {
        this.graphicList = graphicList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGraphictype != null ? idGraphictype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Graphictype)) {
            return false;
        }
        Graphictype other = (Graphictype) object;
        if ((this.idGraphictype == null && other.idGraphictype != null) || (this.idGraphictype != null && !this.idGraphictype.equals(other.idGraphictype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasgenerateentities.Graphictype[ idGraphictype=" + idGraphictype + " ]";
    }
    
}
