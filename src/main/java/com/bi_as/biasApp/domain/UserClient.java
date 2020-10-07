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
@Table(name = "user_client")
@NamedQueries({
        @NamedQuery(name = "UserClient.findAll", query = "SELECT u FROM UserClient u"),
        @NamedQuery(name = "UserClient.findByIdUserclient", query = "SELECT u FROM UserClient u WHERE u.idUserclient = :idUserclient")})
public class UserClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_userclient")
    private Integer idUserclient;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userClientIdUserclient")
    private List<Compra> compraList;
    @JoinColumn(name = "persona_id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private Persona personaIdUser;
    @JoinColumn(name = "strore_id_store", referencedColumnName = "id_store")
    @ManyToOne(optional = false)
    private Store stroreIdStore;

    public UserClient() {
    }

    public UserClient(Integer idUserclient) {
        this.idUserclient = idUserclient;
    }

    public Integer getIdUserclient() {
        return idUserclient;
    }

    public void setIdUserclient(Integer idUserclient) {
        this.idUserclient = idUserclient;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserclient != null ? idUserclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserClient)) {
            return false;
        }
        UserClient other = (UserClient) object;
        if ((this.idUserclient == null && other.idUserclient != null) || (this.idUserclient != null && !this.idUserclient.equals(other.idUserclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.UserClient[ idUserclient=" + idUserclient + " ]";
    }

}
