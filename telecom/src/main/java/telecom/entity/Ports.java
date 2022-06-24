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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "ports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ports.findAll", query = "SELECT p FROM Ports p"),
    @NamedQuery(name = "Ports.findByIdPort", query = "SELECT p FROM Ports p WHERE p.idPort = :idPort"),
    @NamedQuery(name = "Ports.findByName", query = "SELECT p FROM Ports p WHERE p.name = :name"),
    @NamedQuery(name = "Ports.findByIPAddress", query = "SELECT p FROM Ports p WHERE p.iPAddress = :iPAddress"),
    @NamedQuery(name = "Ports.findByMac", query = "SELECT p FROM Ports p WHERE p.mac = :mac"),
    @NamedQuery(name = "Ports.findByStatus", query = "SELECT p FROM Ports p WHERE p.status = :status")})
public class Ports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPort")
    private Integer idPort;
    @Column(name = "name")
    private String name;
    @Column(name = "IPAddress")
    private String iPAddress;
    @Column(name = "MAC")
    private String mac;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "idEquipment", referencedColumnName = "idInformationAboutTheEquipment")
    @ManyToOne
    private Informationabouttheequipment idEquipment;
    @JoinColumn(name = "idPlacement", referencedColumnName = "idPlacement")
    @ManyToOne
    private Placement idPlacement;
    @JoinColumn(name = "portsType", referencedColumnName = "idPortsType")
    @ManyToOne
    private Portstype portsType;

    public Ports() {
    }

    public Ports(Integer idPort) {
        this.idPort = idPort;
    }

    public Integer getIdPort() {
        return idPort;
    }

    public void setIdPort(Integer idPort) {
        this.idPort = idPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIPAddress() {
        return iPAddress;
    }

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Informationabouttheequipment getIdEquipment() {
        return idEquipment;
    }

    public void setIdEquipment(Informationabouttheequipment idEquipment) {
        this.idEquipment = idEquipment;
    }

    public Placement getIdPlacement() {
        return idPlacement;
    }

    public void setIdPlacement(Placement idPlacement) {
        this.idPlacement = idPlacement;
    }

    public Portstype getPortsType() {
        return portsType;
    }

    public void setPortsType(Portstype portsType) {
        this.portsType = portsType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPort != null ? idPort.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ports)) {
            return false;
        }
        Ports other = (Ports) object;
        if ((this.idPort == null && other.idPort != null) || (this.idPort != null && !this.idPort.equals(other.idPort))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Ports[ idPort=" + idPort + " ]";
    }
    
}
