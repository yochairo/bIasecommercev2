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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "graphic")
@NamedQueries({
    @NamedQuery(name = "Graphic.findAll", query = "SELECT g FROM Graphic g"),
    @NamedQuery(name = "Graphic.findByIdGraphic", query = "SELECT g FROM Graphic g WHERE g.idGraphic = :idGraphic"),
    @NamedQuery(name = "Graphic.findByName", query = "SELECT g FROM Graphic g WHERE g.name = :name"),
    @NamedQuery(name = "Graphic.findByTxUser", query = "SELECT g FROM Graphic g WHERE g.txUser = :txUser"),
    @NamedQuery(name = "Graphic.findByTxHost", query = "SELECT g FROM Graphic g WHERE g.txHost = :txHost"),
    @NamedQuery(name = "Graphic.findByTxDate", query = "SELECT g FROM Graphic g WHERE g.txDate = :txDate"),
    @NamedQuery(name = "Graphic.findByActive", query = "SELECT g FROM Graphic g WHERE g.active = :active")})
public class Graphic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_graphic")
    private Integer idGraphic;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
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
/*    @OneToMany(cascade = CascadeType.ALL, mappedBy = "graphicidgraphic")
    private List<Atribute> atributeList;
    @JoinColumn(name = "GraphicType_id_graphictype", referencedColumnName = "id_graphictype")
    @ManyToOne(optional = false)*/
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGraphic")
    private List<AtributeGraphic> atributeGraphicList;
    @JoinColumn(name = "GraphicType_id_graphictype", referencedColumnName = "id_graphictype")
    @ManyToOne(optional = false)
    private Graphictype graphicTypeidgraphictype;
    @JoinColumn(name = "View_id_view", referencedColumnName = "id_view")
    @ManyToOne(optional = false)
    private View viewidview;

    public Graphic() {
    }

    public Graphic(Integer idGraphic) {
        this.idGraphic = idGraphic;
    }

    public Graphic(Integer idGraphic, String name, String txUser, String txHost, String txDate, int active) {
        this.idGraphic = idGraphic;
        this.name = name;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.active = active;
    }

    public Integer getIdGraphic() {
        return idGraphic;
    }

    public void setIdGraphic(Integer idGraphic) {
        this.idGraphic = idGraphic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

/*    public List<Atribute> getAtributeList() {
        return atributeList;
    }

    public void setAtributeList(List<Atribute> atributeList) {
        this.atributeList = atributeList;
    }*/
    public List<AtributeGraphic> getAtributeGraphicList() {
        return atributeGraphicList;
    }

    public void setAtributeGraphicList(List<AtributeGraphic> atributeGraphicList) {
        this.atributeGraphicList = atributeGraphicList;
    }


    public Graphictype getGraphicTypeidgraphictype() {
        return graphicTypeidgraphictype;
    }

    public void setGraphicTypeidgraphictype(Graphictype graphicTypeidgraphictype) {
        this.graphicTypeidgraphictype = graphicTypeidgraphictype;
    }

    public View getViewidview() {
        return viewidview;
    }

    public void setViewidview(View viewidview) {
        this.viewidview = viewidview;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGraphic != null ? idGraphic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Graphic)) {
            return false;
        }
        Graphic other = (Graphic) object;
        if ((this.idGraphic == null && other.idGraphic != null) || (this.idGraphic != null && !this.idGraphic.equals(other.idGraphic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasgenerateentities.Graphic[ idGraphic=" + idGraphic + " ]";
    }
    
}
