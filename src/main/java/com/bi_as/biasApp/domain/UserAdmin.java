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
@Table(name = "user_admin")
@NamedQueries({
        @NamedQuery(name = "UserAdmin.findAll", query = "SELECT u FROM UserAdmin u"),
        @NamedQuery(name = "UserAdmin.findByIdUseradmin", query = "SELECT u FROM UserAdmin u WHERE u.idUseradmin = :idUseradmin")})
public class UserAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_useradmin")
    private Integer idUseradmin;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userAdminIdUseradmin")
    private List<Store> storeList;
    @JoinColumn(name = "persona_id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private Persona personaIdUser;

    public UserAdmin() {
    }

    public UserAdmin(Integer idUseradmin) {
        this.idUseradmin = idUseradmin;
    }

    public Integer getIdUseradmin() {
        return idUseradmin;
    }

    public void setIdUseradmin(Integer idUseradmin) {
        this.idUseradmin = idUseradmin;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }


    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public Persona getPersonaIdUser() {
        return personaIdUser;
    }

    public void setPersonaIdUser(Persona personaIdUser) {
        this.personaIdUser = personaIdUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUseradmin != null ? idUseradmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAdmin)) {
            return false;
        }
        UserAdmin other = (UserAdmin) object;
        if ((this.idUseradmin == null && other.idUseradmin != null) || (this.idUseradmin != null && !this.idUseradmin.equals(other.idUseradmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.UserAdmin[ idUseradmin=" + idUseradmin + " ]";
    }

}
