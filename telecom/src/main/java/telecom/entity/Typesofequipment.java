/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telecom.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "typesofequipment")
@NamedQueries({
    @NamedQuery(name = "Typesofequipment.findAll", query = "SELECT t FROM Typesofequipment t"),
    @NamedQuery(name = "Typesofequipment.findByIdTypes", query = "SELECT t FROM Typesofequipment t WHERE t.idTypes = :idTypes"),
    @NamedQuery(name = "Typesofequipment.findByTitle", query = "SELECT t FROM Typesofequipment t WHERE t.title = :title")})
public class Typesofequipment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idTypes")
    private Integer idTypes;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "type")
    private Collection<Informationabouttheequipment> informationabouttheequipmentCollection;

    public Typesofequipment() {
    }

    public Typesofequipment(Integer idTypes) {
        this.idTypes = idTypes;
    }

    public Integer getIdTypes() {
        return idTypes;
    }

    public void setIdTypes(Integer idTypes) {
        this.idTypes = idTypes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<Informationabouttheequipment> getInformationabouttheequipmentCollection() {
        return informationabouttheequipmentCollection;
    }

    public void setInformationabouttheequipmentCollection(Collection<Informationabouttheequipment> informationabouttheequipmentCollection) {
        this.informationabouttheequipmentCollection = informationabouttheequipmentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypes != null ? idTypes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typesofequipment)) {
            return false;
        }
        Typesofequipment other = (Typesofequipment) object;
        if ((this.idTypes == null && other.idTypes != null) || (this.idTypes != null && !this.idTypes.equals(other.idTypes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Typesofequipment[ idTypes=" + idTypes + " ]";
    }
    
}
