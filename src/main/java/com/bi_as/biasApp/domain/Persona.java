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
@Table(name = "persona")
/*@NamedQueries({
        @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
        @NamedQuery(name = "Persona.findByIdUser", query = "SELECT p FROM Persona p WHERE p.idUser = :idUser"),
        @NamedQuery(name = "Persona.findByNicknameUser", query = "SELECT p FROM Persona p WHERE p.nicknameUser = :nicknameUser"),
        @NamedQuery(name = "Persona.findByName", query = "SELECT p FROM Persona p WHERE p.name = :name"),
        @NamedQuery(name = "Persona.findBySecondName", query = "SELECT p FROM Persona p WHERE p.secondName = :secondName"),
        @NamedQuery(name = "Persona.findByLastName", query = "SELECT p FROM Persona p WHERE p.lastName = :lastName"),
        @NamedQuery(name = "Persona.findBySecondLastName", query = "SELECT p FROM Persona p WHERE p.secondLastName = :secondLastName"),
        @NamedQuery(name = "Persona.findByMail", query = "SELECT p FROM Persona p WHERE p.mail = :mail"),
        @NamedQuery(name = "Persona.findByPassword", query = "SELECT p FROM Persona p WHERE p.password = :password"),
        @NamedQuery(name = "Persona.findByUrlImage", query = "SELECT p FROM Persona p WHERE p.urlImage = :urlImage"),
        @NamedQuery(name = "Persona.findByNameImage", query = "SELECT p FROM Persona p WHERE p.nameImage = :nameImage")})
*/public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Basic(optional = false)
    @Column(name = "nickname_user")
    private String nicknameUser;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "second_name")
    private String secondName;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "second_last_name")
    private String secondLastName;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "url_image")
    private String urlImage;
    @Basic(optional = false)
    @Column(name = "name_image")
    private String nameImage;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaIdUser")
    private List<UserSeller> userSellerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaIdUser")
    private List<UserClient> userClientList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personaIdUser")
    private List<UserAdmin> userAdminList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userIdUser")
    private List<Dashboard> dashboardList;

    public Persona() {
    }

    public Persona(Integer idUser) {
        this.idUser = idUser;
    }

    public Persona(Integer idUser, String nicknameUser, String name, String secondName, String lastName, String secondLastName, String mail, String password, String urlImage, String nameImage) {
        this.idUser = idUser;
        this.nicknameUser = nicknameUser;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.mail = mail;
        this.password = password;
        this.urlImage = urlImage;
        this.nameImage = nameImage;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNicknameUser() {
        return nicknameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<UserSeller> getUserSellerList() {
        return userSellerList;
    }

    public void setUserSellerList(List<UserSeller> userSellerList) {
        this.userSellerList = userSellerList;
    }

    public List<UserClient> getUserClientList() {
        return userClientList;
    }

    public void setUserClientList(List<UserClient> userClientList) {
        this.userClientList = userClientList;
    }

    public List<UserAdmin> getUserAdminList() {
        return userAdminList;
    }

    public void setUserAdminList(List<UserAdmin> userAdminList) {
        this.userAdminList = userAdminList;
    }

    public List<Dashboard> getDashboardList() {
        return dashboardList;
    }

    public void setDashboardList(List<Dashboard> dashboardList) {
        this.dashboardList = dashboardList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biascommerce2.Persona[ idUser=" + idUser + " ]";
    }

}
