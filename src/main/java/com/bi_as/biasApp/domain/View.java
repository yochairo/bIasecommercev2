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
@Table(name = "view")
@NamedQueries({
    @NamedQuery(name = "View.findAll", query = "SELECT v FROM View v"),
    @NamedQuery(name = "View.findByIdView", query = "SELECT v FROM View v WHERE v.idView = :idView"),
    @NamedQuery(name = "View.findByName", query = "SELECT v FROM View v WHERE v.name = :name"),
    @NamedQuery(name = "View.findByTxUser", query = "SELECT v FROM View v WHERE v.txUser = :txUser"),
    @NamedQuery(name = "View.findByTxHost", query = "SELECT v FROM View v WHERE v.txHost = :txHost"),
    @NamedQuery(name = "View.findByTxDate", query = "SELECT v FROM View v WHERE v.txDate = :txDate"),
    @NamedQuery(name = "View.findByActive", query = "SELECT v FROM View v WHERE v.active = :active")})
public class View implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_view")
    private Integer idView;
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
    @JoinColumn(name = "Dashboard_id_dashboard", referencedColumnName = "id_dashboard")
    @ManyToOne(optional = false)
    private Dashboard dashboardiddashboard;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "viewidview")
    private List<Graphic> graphicList;

    public View() {
    }

    public View(Integer idView) {
        this.idView = idView;
    }

    public View(Integer idView, String name, String txUser, String txHost, String txDate, int active) {
        this.idView = idView;
        this.name = name;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.active = active;
    }

    public Integer getIdView() {
        return idView;
    }

    public void setIdView(Integer idView) {
        this.idView = idView;
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

    public Dashboard getDashboardiddashboard() {
        return dashboardiddashboard;
    }

    public void setDashboardiddashboard(Dashboard dashboardiddashboard) {
        this.dashboardiddashboard = dashboardiddashboard;
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
        hash += (idView != null ? idView.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof View)) {
            return false;
        }
        View other = (View) object;
        if ((this.idView == null && other.idView != null) || (this.idView != null && !this.idView.equals(other.idView))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vista:{" +
                "idVista="+idView+
                "Nombre="+name+"" +
                "}";
    }
    
}
