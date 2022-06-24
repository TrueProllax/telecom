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
@Table(name = "portstype")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portstype.findAll", query = "SELECT p FROM Portstype p"),
    @NamedQuery(name = "Portstype.findByIdPortsType", query = "SELECT p FROM Portstype p WHERE p.idPortsType = :idPortsType"),
    @NamedQuery(name = "Portstype.findByTitle", query = "SELECT p FROM Portstype p WHERE p.title = :title")})
public class Portstype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPortsType")
    private Integer idPortsType;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "portsType")
    private Collection<Ports> portsCollection;

    public Portstype() {
    }

    public Portstype(Integer idPortsType) {
        this.idPortsType = idPortsType;
    }

    public Integer getIdPortsType() {
        return idPortsType;
    }

    public void setIdPortsType(Integer idPortsType) {
        this.idPortsType = idPortsType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        hash += (idPortsType != null ? idPortsType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Portstype)) {
            return false;
        }
        Portstype other = (Portstype) object;
        if ((this.idPortsType == null && other.idPortsType != null) || (this.idPortsType != null && !this.idPortsType.equals(other.idPortsType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Portstype[ idPortsType=" + idPortsType + " ]";
    }
    
}
