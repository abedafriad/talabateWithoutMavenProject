/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Abed
 */
@Entity
public class SupplementPlat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double addition;
    private Double newPrice;
    @ManyToOne
    private PlatMenu platMenu;
    @ManyToOne
    private Supplement supplement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PlatMenu getPlatMenu() {
        return platMenu;
    }

    public void setPlatMenu(PlatMenu platMenu) {
        this.platMenu = platMenu;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public Double getAddition() {
        return addition;
    }

    public void setAddition(Double addition) {
        this.addition = addition;
    }

    public Supplement getSupplement() {
        return supplement;
    }

    public void setSupplement(Supplement supplement) {
        this.supplement = supplement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplementPlat)) {
            return false;
        }
        SupplementPlat other = (SupplementPlat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public SupplementPlat(Double addition, PlatMenu platMenu, Supplement supplement) {
        this.addition = addition;
        this.platMenu = platMenu;
        this.supplement = supplement;
    }

    public SupplementPlat() {
    }

    @Override
    public String toString() {
        return supplement.getNom() + "(" + getNewPrice() + ")";
    }

}
