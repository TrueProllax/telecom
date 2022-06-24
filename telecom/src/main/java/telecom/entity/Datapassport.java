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
@Table(name = "datapassport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datapassport.findAll", query = "SELECT d FROM Datapassport d"),
    @NamedQuery(name = "Datapassport.findByIdDataPassport", query = "SELECT d FROM Datapassport d WHERE d.idDataPassport = :idDataPassport"),
    @NamedQuery(name = "Datapassport.findBySeria", query = "SELECT d FROM Datapassport d WHERE d.seria = :seria"),
    @NamedQuery(name = "Datapassport.findByNumber", query = "SELECT d FROM Datapassport d WHERE d.number = :number"),
    @NamedQuery(name = "Datapassport.findByDataIssue", query = "SELECT d FROM Datapassport d WHERE d.dataIssue = :dataIssue"),
    @NamedQuery(name = "Datapassport.findByIssuing", query = "SELECT d FROM Datapassport d WHERE d.issuing = :issuing")})
public class Datapassport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDataPassport")
    private Integer idDataPassport;
    @Column(name = "seria")
    private String seria;
    @Column(name = "number")
    private String number;
    @Column(name = "dataIssue")
    @Temporal(TemporalType.DATE)
    private Date dataIssue;
    @Column(name = "issuing")
    private String issuing;
    @OneToMany(mappedBy = "passport")
    private Collection<Abonent> abonentCollection;

    public Datapassport() {
    }

    public Datapassport(Integer idDataPassport) {
        this.idDataPassport = idDataPassport;
    }

    public Integer getIdDataPassport() {
        return idDataPassport;
    }

    public void setIdDataPassport(Integer idDataPassport) {
        this.idDataPassport = idDataPassport;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDataIssue() {
        return dataIssue;
    }

    public void setDataIssue(Date dataIssue) {
        this.dataIssue = dataIssue;
    }

    public String getIssuing() {
        return issuing;
    }

    public void setIssuing(String issuing) {
        this.issuing = issuing;
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
        hash += (idDataPassport != null ? idDataPassport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datapassport)) {
            return false;
        }
        Datapassport other = (Datapassport) object;
        if ((this.idDataPassport == null && other.idDataPassport != null) || (this.idDataPassport != null && !this.idDataPassport.equals(other.idDataPassport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Datapassport[ idDataPassport=" + idDataPassport + " ]";
    }
    
}
