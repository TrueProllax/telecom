/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telecom.entity;

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
 * @author 200573
 */
@Entity
@Table(name = "equipment")
@NamedQueries({
    @NamedQuery(name = "Equipment.findAll", query = "SELECT e FROM Equipment e"),
    @NamedQuery(name = "Equipment.findByIdEquipment", query = "SELECT e FROM Equipment e WHERE e.idEquipment = :idEquipment"),
    @NamedQuery(name = "Equipment.findByName", query = "SELECT e FROM Equipment e WHERE e.name = :name"),
    @NamedQuery(name = "Equipment.findByState", query = "SELECT e FROM Equipment e WHERE e.state = :state")})
public class Equipment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEquipment")
    private Integer idEquipment;
    @Column(name = "name")
    private String name;
    @Column(name = "state")
    private String state;
    @JoinColumn(name = "idInformation", referencedColumnName = "idInformationAboutTheEquipment")
    @ManyToOne
    private Informationabouttheequipment idInformation;

    public Equipment() {
    }

    public Equipment(Integer idEquipment) {
        this.idEquipment = idEquipment;
    }

    public Integer getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(Integer idEquipment) {
        this.idEquipment = idEquipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Informationabouttheequipment getIdInformation() {
        return idInformation;
    }

    public void setIdInformation(Informationabouttheequipment idInformation) {
        this.idInformation = idInformation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipment != null ? idEquipment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipment)) {
            return false;
        }
        Equipment other = (Equipment) object;
        if ((this.idEquipment == null && other.idEquipment != null) || (this.idEquipment != null && !this.idEquipment.equals(other.idEquipment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Equipment[ idEquipment=" + idEquipment + " ]";
    }
    
}
