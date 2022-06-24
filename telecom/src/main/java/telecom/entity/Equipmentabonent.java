/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telecom.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "equipmentabonent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipmentabonent.findAll", query = "SELECT e FROM Equipmentabonent e"),
    @NamedQuery(name = "Equipmentabonent.findByIdEquipmentAbonent", query = "SELECT e FROM Equipmentabonent e WHERE e.idEquipmentAbonent = :idEquipmentAbonent"),
    @NamedQuery(name = "Equipmentabonent.findByTermContract", query = "SELECT e FROM Equipmentabonent e WHERE e.termContract = :termContract"),
    @NamedQuery(name = "Equipmentabonent.findByConditionBuying", query = "SELECT e FROM Equipmentabonent e WHERE e.conditionBuying = :conditionBuying")})
public class Equipmentabonent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEquipmentAbonent")
    private Integer idEquipmentAbonent;
    @Column(name = "termContract")
    @Temporal(TemporalType.DATE)
    private Date termContract;
    @Column(name = "conditionBuying")
    private String conditionBuying;
    @JoinColumn(name = "idAbonent", referencedColumnName = "idAbonent")
    @ManyToOne
    private Abonent idAbonent;
    @JoinColumn(name = "idEquipment", referencedColumnName = "idEquipment")
    @ManyToOne
    private Equipment idEquipment;

    public Equipmentabonent() {
    }

    public Equipmentabonent(Integer idEquipmentAbonent) {
        this.idEquipmentAbonent = idEquipmentAbonent;
    }

    public Integer getIdEquipmentAbonent() {
        return idEquipmentAbonent;
    }

    public void setIdEquipmentAbonent(Integer idEquipmentAbonent) {
        this.idEquipmentAbonent = idEquipmentAbonent;
    }

    public Date getTermContract() {
        return termContract;
    }

    public void setTermContract(Date termContract) {
        this.termContract = termContract;
    }

    public String getConditionBuying() {
        return conditionBuying;
    }

    public void setConditionBuying(String conditionBuying) {
        this.conditionBuying = conditionBuying;
    }

    public Abonent getIdAbonent() {
        return idAbonent;
    }

    public void setIdAbonent(Abonent idAbonent) {
        this.idAbonent = idAbonent;
    }

    public Equipment getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(Equipment idEquipment) {
        this.idEquipment = idEquipment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipmentAbonent != null ? idEquipmentAbonent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipmentabonent)) {
            return false;
        }
        Equipmentabonent other = (Equipmentabonent) object;
        if ((this.idEquipmentAbonent == null && other.idEquipmentAbonent != null) || (this.idEquipmentAbonent != null && !this.idEquipmentAbonent.equals(other.idEquipmentAbonent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Equipmentabonent[ idEquipmentAbonent=" + idEquipmentAbonent + " ]";
    }
    
}
