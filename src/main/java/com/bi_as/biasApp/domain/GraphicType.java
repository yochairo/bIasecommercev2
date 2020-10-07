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
@Table(name = "graphic_type")
@NamedQueries({
        @NamedQuery(name = "GraphicType.findAll", query = "SELECT g FROM GraphicType g"),
        @NamedQuery(name = "GraphicType.findByIdGraphictype", query = "SELECT g FROM GraphicType g WHERE g.idGraphictype = :idGraphictype"),
        @NamedQuery(name = "GraphicType.findByName", query = "SELECT g FROM GraphicType g WHERE g.name = :name"),
        @NamedQuery(name = "GraphicType.findByActive", query = "SELECT g FROM GraphicType g WHERE g.active = :active")})
public class GraphicType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_graphictype")
    private Integer idGraphictype;
    @Basic(optional = false)
    @Column(name = "name")
    private int name;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphicTypeIdGraphictype")
    private List<Graphic> graphicList;

    public GraphicType() {
    }

    public GraphicType(Integer idGraphictype) {
        this.idGraphictype = idGraphictype;
    }

    public GraphicType(Integer idGraphictype, int name, int active) {
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

    public int getName() {
        return name;
    }

    public void setName(int name) {
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
        if (!(object instanceof GraphicType)) {
            return false;
        }
        GraphicType other = (GraphicType) object;
        if ((this.idGraphictype == null && other.idGraphictype != null) || (this.idGraphictype != null && !this.idGraphictype.equals(other.idGraphictype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.GraphicType[ idGraphictype=" + idGraphictype + " ]";
    }

}
