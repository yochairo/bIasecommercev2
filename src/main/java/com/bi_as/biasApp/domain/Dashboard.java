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
@Table(name = "dashboard")
//@NamedQueries({
//    @NamedQuery(name = "Dashboard.findAll", query = "SELECT d FROM Dashboard d"),
//    @NamedQuery(name = "Dashboard.findByIdDashboard", query = "SELECT d FROM Dashboard d WHERE d.idDashboard = :idDashboard"),
//    @NamedQuery(name = "Dashboard.findByName", query = "SELECT d FROM Dashboard d WHERE d.name = :name"),
//    @NamedQuery(name = "Dashboard.findByTxUser", query = "SELECT d FROM Dashboard d WHERE d.txUser = :txUser"),
//    @NamedQuery(name = "Dashboard.findByTxHost", query = "SELECT d FROM Dashboard d WHERE d.txHost = :txHost"),
//    @NamedQuery(name = "Dashboard.findByTxDate", query = "SELECT d FROM Dashboard d WHERE d.txDate = :txDate"),
//    @NamedQuery(name = "Dashboard.findByActive", query = "SELECT d FROM Dashboard d WHERE d.active = :active")})
public class Dashboard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_dashboard")
    private Integer idDashboard;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dashboardiddashboard")
    private List<View> viewList;
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private User userIdUser;

    public Dashboard() {
    }

    public Dashboard(Integer idDashboard) {
        this.idDashboard = idDashboard;
    }

    public Dashboard(Integer idDashboard, String name, String txUser, String txHost, String txDate, int active) {
        this.idDashboard = idDashboard;
        this.name = name;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.active = active;
    }

    public Integer getIdDashboard() {
        return idDashboard;
    }

    public void setIdDashboard(Integer idDashboard) {
        this.idDashboard = idDashboard;
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

    public List<View> getViewList() {
        return viewList;
    }

    public void setViewList(List<View> viewList) {
        this.viewList = viewList;
    }

    public User getUserIdUser() {
        return userIdUser;
    }

    public void setUserIdUser(User userIdUser) {
        this.userIdUser = userIdUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDashboard != null ? idDashboard.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dashboard)) {
            return false;
        }
        Dashboard other = (Dashboard) object;
        if ((this.idDashboard == null && other.idDashboard != null) || (this.idDashboard != null && !this.idDashboard.equals(other.idDashboard))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasgenerateentities.Dashboard[ idDashboard=" + idDashboard + " ]";
    }
    
}
