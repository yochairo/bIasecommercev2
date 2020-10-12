package com.bi_as.biasApp.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "permissions")
@NamedQueries({
        @NamedQuery(name = "Permissions.findAll", query = "SELECT p FROM Permissions p"),
        @NamedQuery(name = "Permissions.findByPermissions", query = "SELECT p FROM Permissions p WHERE p.permissions = :permissions"),
        @NamedQuery(name = "Permissions.findByPermissionName", query = "SELECT p FROM Permissions p WHERE p.permissionName = :permissionName")})
public class Permissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "permissions")
    private Integer permissions;
    @Basic(optional = false)
    @Column(name = "permission_name")
    private String permissionName;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permissionsPermissions")
    private List<PermissionUserSeller> permissionUserSellerList;

    public Permissions() {
    }

    public Permissions(Integer permissions) {
        this.permissions = permissions;
    }

    public Permissions(Integer permissions, String permissionName) {
        this.permissions = permissions;
        this.permissionName = permissionName;
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
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
        hash += (permissions != null ? permissions.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissions)) {
            return false;
        }
        Permissions other = (Permissions) object;
        if ((this.permissions == null && other.permissions != null) || (this.permissions != null && !this.permissions.equals(other.permissions))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Permissions[ permissions=" + permissions + " ]";
    }

}
