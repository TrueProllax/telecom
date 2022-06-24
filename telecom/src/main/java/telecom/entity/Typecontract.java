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
@Table(name = "typecontract")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typecontract.findAll", query = "SELECT t FROM Typecontract t"),
    @NamedQuery(name = "Typecontract.findByIdTypeContract", query = "SELECT t FROM Typecontract t WHERE t.idTypeContract = :idTypeContract"),
    @NamedQuery(name = "Typecontract.findByName", query = "SELECT t FROM Typecontract t WHERE t.name = :name")})
public class Typecontract implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTypeContract")
    private Integer idTypeContract;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "typeContract")
    private Collection<Contract> contractCollection;

    public Typecontract() {
    }

    public Typecontract(Integer idTypeContract) {
        this.idTypeContract = idTypeContract;
    }

    public Integer getIdTypeContract() {
        return idTypeContract;
    }

    public void setIdTypeContract(Integer idTypeContract) {
        this.idTypeContract = idTypeContract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Contract> getContractCollection() {
        return contractCollection;
    }

    public void setContractCollection(Collection<Contract> contractCollection) {
        this.contractCollection = contractCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypeContract != null ? idTypeContract.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typecontract)) {
            return false;
        }
        Typecontract other = (Typecontract) object;
        if ((this.idTypeContract == null && other.idTypeContract != null) || (this.idTypeContract != null && !this.idTypeContract.equals(other.idTypeContract))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Typecontract[ idTypeContract=" + idTypeContract + " ]";
    }
    
}
