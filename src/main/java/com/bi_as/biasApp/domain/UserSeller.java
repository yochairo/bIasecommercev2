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
@Table(name = "user_seller")
@NamedQueries({
        @NamedQuery(name = "UserSeller.findAll", query = "SELECT u FROM UserSeller u"),
        @NamedQuery(name = "UserSeller.findByIdUserseller", query = "SELECT u FROM UserSeller u WHERE u.idUserseller = :idUserseller")})
public class UserSeller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_userseller")
    private Integer idUserseller;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @JoinColumn(name = "persona_id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private Persona personaIdUser;
    @JoinColumn(name = "strore_id_store", referencedColumnName = "id_store")
    @ManyToOne(optional = false)
    private Store stroreIdStore;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userSellerIdUserseller")
    private List<PermissionUserSeller> permissionUserSellerList;

    public UserSeller() {
    }

    public UserSeller(Integer idUserseller) {
        this.idUserseller = idUserseller;
    }

    public Integer getIdUserseller() {
        return idUserseller;
    }

    public void setIdUserseller(Integer idUserseller) {
        this.idUserseller = idUserseller;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Persona getPersonaIdUser() {
        return personaIdUser;
    }

    public void setPersonaIdUser(Persona personaIdUser) {
        this.personaIdUser = personaIdUser;
    }

    public Store getStroreIdStore() {
        return stroreIdStore;
    }

    public void setStroreIdStore(Store stroreIdStore) {
        this.stroreIdStore = stroreIdStore;
    }

    public List<PermissionUserSeller> getPermissionUserSellerList() {
        return permissionUserSellerList;
    }

    public void setPermissionUserSellerList(List<PermissionUserSeller> permissionUserSellerList) {
        this.permissionUserSellerList = permissionUserSellerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserseller != null ? idUserseller.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserSeller)) {
            return false;
        }
        UserSeller other = (UserSeller) object;
        if ((this.idUserseller == null && other.idUserseller != null) || (this.idUserseller != null && !this.idUserseller.equals(other.idUserseller))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.UserSeller[ idUserseller=" + idUserseller + " ]";
    }

}
