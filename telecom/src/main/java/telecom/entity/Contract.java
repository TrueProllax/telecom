/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telecom.entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "contract")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contract.findAll", query = "SELECT c FROM Contract c"),
    @NamedQuery(name = "Contract.findByIdContract", query = "SELECT c FROM Contract c WHERE c.idContract = :idContract"),
    @NamedQuery(name = "Contract.findByNumber", query = "SELECT c FROM Contract c WHERE c.number = :number"),
    @NamedQuery(name = "Contract.findByDateBegin", query = "SELECT c FROM Contract c WHERE c.dateBegin = :dateBegin"),
    @NamedQuery(name = "Contract.findByDateEnd", query = "SELECT c FROM Contract c WHERE c.dateEnd = :dateEnd"),
    @NamedQuery(name = "Contract.findByNoteReasonEnd", query = "SELECT c FROM Contract c WHERE c.noteReasonEnd = :noteReasonEnd"),
    @NamedQuery(name = "Contract.findByStatus", query = "SELECT c FROM Contract c WHERE c.status = :status")})
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idContract")
    private Integer idContract;
    @Column(name = "number")
    private String number;
    @Column(name = "dateBegin")
    @Temporal(TemporalType.DATE)
    private Date dateBegin;
    @Column(name = "dateEnd")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;
    @Column(name = "noteReasonEnd")
    private String noteReasonEnd;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "typeContract", referencedColumnName = "idTypeContract")
    @ManyToOne
    private Typecontract typeContract;
    @OneToMany(mappedBy = "contact")
    private Collection<Abonent> abonentCollection;

    public Contract() {
    }

    public Contract(Integer idContract) {
        this.idContract = idContract;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNoteReasonEnd() {
        return noteReasonEnd;
    }

    public void setNoteReasonEnd(String noteReasonEnd) {
        this.noteReasonEnd = noteReasonEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Typecontract getTypeContract() {
        return typeContract;
    }

    public void setTypeContract(Typecontract typeContract) {
        this.typeContract = typeContract;
    }

    @XmlTransient
    public Collection<Abonent> getAbonentCollection() {
        return abonentCollection;
    }

    public void setAbonentCollection(Collection<Abonent> abonentCollection) {
        this.abonentCollection = abonentCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContract != null ? idContract.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contract)) {
            return false;
        }
        Contract other = (Contract) object;
        if ((this.idContract == null && other.idContract != null) || (this.idContract != null && !this.idContract.equals(other.idContract))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Contract[ idContract=" + idContract + " ]";
    }
    
}
