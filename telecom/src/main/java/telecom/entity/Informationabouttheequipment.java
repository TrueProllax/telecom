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
 * @author 200573
 */
@Entity
@Table(name = "informationabouttheequipment")
@NamedQueries({
    @NamedQuery(name = "Informationabouttheequipment.findAll", query = "SELECT i FROM Informationabouttheequipment i"),
    @NamedQuery(name = "Informationabouttheequipment.findByIdInformationAboutTheEquipment", query = "SELECT i FROM Informationabouttheequipment i WHERE i.idInformationAboutTheEquipment = :idInformationAboutTheEquipment"),
    @NamedQuery(name = "Informationabouttheequipment.findBySerialNumber", query = "SELECT i FROM Informationabouttheequipment i WHERE i.serialNumber = :serialNumber"),
    @NamedQuery(name = "Informationabouttheequipment.findByOSInventoryNumber", query = "SELECT i FROM Informationabouttheequipment i WHERE i.oSInventoryNumber = :oSInventoryNumber"),
    @NamedQuery(name = "Informationabouttheequipment.findByNote", query = "SELECT i FROM Informationabouttheequipment i WHERE i.note = :note"),
    @NamedQuery(name = "Informationabouttheequipment.findByNoteAboutPlace", query = "SELECT i FROM Informationabouttheequipment i WHERE i.noteAboutPlace = :noteAboutPlace"),
    @NamedQuery(name = "Informationabouttheequipment.findByNoteAboutInstatlation", query = "SELECT i FROM Informationabouttheequipment i WHERE i.noteAboutInstatlation = :noteAboutInstatlation")})
public class Informationabouttheequipment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInformationAboutTheEquipment")
    private Integer idInformationAboutTheEquipment;
    @Column(name = "serialNumber")
    private Integer serialNumber;
    @Column(name = "OSInventoryNumber")
    private Integer oSInventoryNumber;
    @Column(name = "note")
    private String note;
    @Column(name = "noteAboutPlace")
    private String noteAboutPlace;
    @Column(name = "noteAboutInstatlation")
    private String noteAboutInstatlation;
    @OneToMany(mappedBy = "idInformation")
    private Collection<Equipment> equipmentCollection;
    @OneToMany(mappedBy = "idEquipment")
    private Collection<Ports> portsCollection;
    @JoinColumn(name = "type", referencedColumnName = "idTypes")
    @ManyToOne
    private Typesofequipment type;

    public Informationabouttheequipment() {
    }

    public Informationabouttheequipment(Integer idInformationAboutTheEquipment) {
        this.idInformationAboutTheEquipment = idInformationAboutTheEquipment;
    }

    public Integer getIdInformationAboutTheEquipment() {
        return idInformationAboutTheEquipment;
    }

    public void setIdInformationAboutTheEquipment(Integer idInformationAboutTheEquipment) {
        this.idInformationAboutTheEquipment = idInformationAboutTheEquipment;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getOSInventoryNumber() {
        return oSInventoryNumber;
    }

    public void setOSInventoryNumber(Integer oSInventoryNumber) {
        this.oSInventoryNumber = oSInventoryNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNoteAboutPlace() {
        return noteAboutPlace;
    }

    public void setNoteAboutPlace(String noteAboutPlace) {
        this.noteAboutPlace = noteAboutPlace;
    }

    public String getNoteAboutInstatlation() {
        return noteAboutInstatlation;
    }

    public void setNoteAboutInstatlation(String noteAboutInstatlation) {
        this.noteAboutInstatlation = noteAboutInstatlation;
    }

    public Collection<Equipment> getEquipmentCollection() {
        return equipmentCollection;
    }

    public void setEquipmentCollection(Collection<Equipment> equipmentCollection) {
        this.equipmentCollection = equipmentCollection;
    }

    public Collection<Ports> getPortsCollection() {
        return portsCollection;
    }

    public void setPortsCollection(Collection<Ports> portsCollection) {
        this.portsCollection = portsCollection;
    }

    public Typesofequipment getType() {
        return type;
    }

    public void setType(Typesofequipment type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInformationAboutTheEquipment != null ? idInformationAboutTheEquipment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informationabouttheequipment)) {
            return false;
        }
        Informationabouttheequipment other = (Informationabouttheequipment) object;
        if ((this.idInformationAboutTheEquipment == null && other.idInformationAboutTheEquipment != null) || (this.idInformationAboutTheEquipment != null && !this.idInformationAboutTheEquipment.equals(other.idInformationAboutTheEquipment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Informationabouttheequipment[ idInformationAboutTheEquipment=" + idInformationAboutTheEquipment + " ]";
    }
    
}
