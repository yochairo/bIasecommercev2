package com.bi_as.biasApp.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "compra")
@NamedQueries({
        @NamedQuery(name = "Compra.findAll", query = "SELECT c FROM Compra c"),
        @NamedQuery(name = "Compra.findByIdCompra", query = "SELECT c FROM Compra c WHERE c.idCompra = :idCompra"),
        @NamedQuery(name = "Compra.findByDate", query = "SELECT c FROM Compra c WHERE c.date = :date"),
        @NamedQuery(name = "Compra.findByTxSeller", query = "SELECT c FROM Compra c WHERE c.txSeller = :txSeller")})
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Basic(optional = false)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @Column(name = "tx_seller")
    private int txSeller;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @Basic(optional = false)
    @Column(name = "Estado")
    private int estado;
    @JoinColumn(name = "user_client_id_userclient", referencedColumnName = "id_userclient")
    @ManyToOne(optional = false)
    private UserClient userClientIdUserclient;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compraIdCompra")
    private List<ProductCompra> productCompraList;

    public Compra() {
    }

    public Compra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Compra(Integer idCompra, String date, int txSeller) {
        this.idCompra = idCompra;
        this.date = date;
        this.txSeller = txSeller;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTxSeller() {
        return txSeller;
    }

    public void setTxSeller(int txSeller) {
        this.txSeller = txSeller;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public UserClient getUserClientIdUserclient() {
        return userClientIdUserclient;
    }

    public void setUserClientIdUserclient(UserClient userClientIdUserclient) {
        this.userClientIdUserclient = userClientIdUserclient;
    }

    public List<ProductCompra> getProductCompraList() {
        return productCompraList;
    }

    public void setProductCompraList(List<ProductCompra> productCompraList) {
        this.productCompraList = productCompraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.Compra[ idCompra=" + idCompra + " ]";
    }

}
