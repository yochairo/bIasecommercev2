package com.bi_as.biasApp.domain;

import java.io.Serializable;
//import java.security.Permissions;
//import java.security.Permissions;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "permission_user_seller")
@NamedQueries({
        @NamedQuery(name = "PermissionUserSeller.findAll", query = "SELECT p FROM PermissionUserSeller p"),
        @NamedQuery(name = "PermissionUserSeller.findByIdPermissionuser", query = "SELECT p FROM PermissionUserSeller p WHERE p.idPermissionuser = :idPermissionuser")})
public class PermissionUserSeller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_permissionuser")
    private Integer idPermissionuser;
    @JoinColumn(name = "permissions_permissions", referencedColumnName = "permissions")
    @ManyToOne(optional = false)
    private com.bi_as.biasApp.domain.Permissions permissionsPermissions;
    @JoinColumn(name = "user_seller_id_userseller", referencedColumnName = "id_userseller")
    @ManyToOne(optional = false)
    private UserSeller userSellerIdUserseller;

    public PermissionUserSeller() {
    }

    public PermissionUserSeller(Integer idPermissionuser) {
        this.idPermissionuser = idPermissionuser;
    }

    public Integer getIdPermissionuser() {
        return idPermissionuser;
    }

    public void setIdPermissionuser(Integer idPermissionuser) {
        this.idPermissionuser = idPermissionuser;
    }

    public Permissions getPermissionsPermissions() {
        return permissionsPermissions;
    }

    public void setPermissionsPermissions(Permissions permissionsPermissions) {
        this.permissionsPermissions = permissionsPermissions;
    }

    public UserSeller getUserSellerIdUserseller() {
        return userSellerIdUserseller;
    }

    public void setUserSellerIdUserseller(UserSeller userSellerIdUserseller) {
        this.userSellerIdUserseller = userSellerIdUserseller;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermissionuser != null ? idPermissionuser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermissionUserSeller)) {
            return false;
        }
        PermissionUserSeller other = (PermissionUserSeller) object;
        if ((this.idPermissionuser == null && other.idPermissionuser != null) || (this.idPermissionuser != null && !this.idPermissionuser.equals(other.idPermissionuser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.PermissionUserSeller[ idPermissionuser=" + idPermissionuser + " ]";
    }

}
