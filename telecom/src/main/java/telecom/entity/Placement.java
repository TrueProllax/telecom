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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "placement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Placement.findAll", query = "SELECT p FROM Placement p"),
    @NamedQuery(name = "Placement.findByIdPlacement", query = "SELECT p FROM Placement p WHERE p.idPlacement = :idPlacement"),
    @NamedQuery(name = "Placement.findByAddress", query = "SELECT p FROM Placement p WHERE p.address = :address"),
    @NamedQuery(name = "Placement.findByConnectionPoint", query = "SELECT p FROM Placement p WHERE p.connectionPoint = :connectionPoint"),
    @NamedQuery(name = "Placement.findByCoordinates", query = "SELECT p FROM Placement p WHERE p.coordinates = :coordinates")})
public class Placement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlacement")
    private Integer idPlacement;
    @Column(name = "address")
    private String address;
    @Column(name = "connectionPoint")
    private String connectionPoint;
    @Column(name = "coordinates")
    private String coordinates;
    @OneToMany(mappedBy = "idPlacement")
    private Collection<Ports> portsCollection;

    public Placement() {
    }

    public Placement(Integer idPlacement) {
        this.idPlacement = idPlacement;
    }

    public Integer getIdPlacement() {
        return idPlacement;
    }

    public void setIdPlacement(Integer idPlacement) {
        this.idPlacement = idPlacement;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConnectionPoint() {
        return connectionPoint;
    }

    public void setConnectionPoint(String connectionPoint) {
        this.connectionPoint = connectionPoint;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @XmlTransient
    public Collection<Ports> getPortsCollection() {
        return portsCollection;
    }

    public void setPortsCollection(Collection<Ports> portsCollection) {
        this.portsCollection = portsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlacement != null ? idPlacement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Placement)) {
            return false;
        }
        Placement other = (Placement) object;
        if ((this.idPlacement == null && other.idPlacement != null) || (this.idPlacement != null && !this.idPlacement.equals(other.idPlacement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Placement[ idPlacement=" + idPlacement + " ]";
    }
    
}
