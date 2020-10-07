package com.bi_as.biasApp.domain;

import java.io.Serializable;
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
@Table(name = "product_compra")
@NamedQueries({
        @NamedQuery(name = "ProductCompra.findAll", query = "SELECT p FROM ProductCompra p"),
        @NamedQuery(name = "ProductCompra.findByIdUserproduct", query = "SELECT p FROM ProductCompra p WHERE p.idUserproduct = :idUserproduct")})
public class ProductCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_userproduct")
    private Integer idUserproduct;
    @JoinColumn(name = "compra_id_compra", referencedColumnName = "id_compra")
    @ManyToOne(optional = false)
    private Compra compraIdCompra;
    @JoinColumn(name = "product_id_product", referencedColumnName = "id_product")
    @ManyToOne(optional = false)
    private Product productIdProduct;

    public ProductCompra() {
    }

    public ProductCompra(Integer idUserproduct) {
        this.idUserproduct = idUserproduct;
    }

    public Integer getIdUserproduct() {
        return idUserproduct;
    }

    public void setIdUserproduct(Integer idUserproduct) {
        this.idUserproduct = idUserproduct;
    }

    public Compra getCompraIdCompra() {
        return compraIdCompra;
    }

    public void setCompraIdCompra(Compra compraIdCompra) {
        this.compraIdCompra = compraIdCompra;
    }

    public Product getProductIdProduct() {
        return productIdProduct;
    }

    public void setProductIdProduct(Product productIdProduct) {
        this.productIdProduct = productIdProduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserproduct != null ? idUserproduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductCompra)) {
            return false;
        }
        ProductCompra other = (ProductCompra) object;
        if ((this.idUserproduct == null && other.idUserproduct != null) || (this.idUserproduct != null && !this.idUserproduct.equals(other.idUserproduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.ProductCompra[ idUserproduct=" + idUserproduct + " ]";
    }

}
