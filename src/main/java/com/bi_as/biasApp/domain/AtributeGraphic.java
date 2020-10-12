package com.bi_as.biasApp.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "atribute_graphic")
@NamedQueries({
        @NamedQuery(name = "AtributeGraphic.findAll", query = "SELECT a FROM AtributeGraphic a"),
        @NamedQuery(name = "AtributeGraphic.findByIdAtributeGraphic", query = "SELECT a FROM AtributeGraphic a WHERE a.idAtributeGraphic = :idAtributeGraphic")})
public class AtributeGraphic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_atribute_graphic")
    private Integer idAtributeGraphic;
    @Basic(optional = false)
    @Column(name = "active")
    private int active;
    @JoinColumn(name = "atribute_id_atribute", referencedColumnName = "id_atribute")
    @ManyToOne(optional = false)
    private Atribute atributeIdAtribute;
    @JoinColumn(name = "graphic_id_graphic", referencedColumnName = "id_graphic")
    @ManyToOne(optional = false)
    private Graphic graphicIdGraphic;

    public AtributeGraphic() {
    }

    public AtributeGraphic(Integer idAtributeGraphic) {
        this.idAtributeGraphic = idAtributeGraphic;
    }

    public Integer getIdAtributeGraphic() {
        return idAtributeGraphic;
    }

    public void setIdAtributeGraphic(Integer idAtributeGraphic) {
        this.idAtributeGraphic = idAtributeGraphic;
    }

    public Atribute getAtributeIdAtribute() {
        return atributeIdAtribute;
    }

    public void setAtributeIdAtribute(Atribute atributeIdAtribute) {
        this.atributeIdAtribute = atributeIdAtribute;
    }

    public Graphic getGraphicIdGraphic() {
        return graphicIdGraphic;
    }

    public void setGraphicIdGraphic(Graphic graphicIdGraphic) {
        this.graphicIdGraphic = graphicIdGraphic;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtributeGraphic != null ? idAtributeGraphic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtributeGraphic)) {
            return false;
        }
        AtributeGraphic other = (AtributeGraphic) object;
        if ((this.idAtributeGraphic == null && other.idAtributeGraphic != null) || (this.idAtributeGraphic != null && !this.idAtributeGraphic.equals(other.idAtributeGraphic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyectokajoy.biasecommerce.AtributeGraphic[ idAtributeGraphic=" + idAtributeGraphic + " ]";
    }

}
