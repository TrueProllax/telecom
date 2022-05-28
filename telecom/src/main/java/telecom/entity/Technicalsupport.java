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
@Table(name = "technicalsupport")
@NamedQueries({
    @NamedQuery(name = "Technicalsupport.findAll", query = "SELECT t FROM Technicalsupport t"),
    @NamedQuery(name = "Technicalsupport.findByIdTechnicalSupport", query = "SELECT t FROM Technicalsupport t WHERE t.idTechnicalSupport = :idTechnicalSupport"),
    @NamedQuery(name = "Technicalsupport.findByAppeal", query = "SELECT t FROM Technicalsupport t WHERE t.appeal = :appeal")})
public class Technicalsupport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTechnicalSupport")
    private Integer idTechnicalSupport;
    @Column(name = "appeal")
    private String appeal;
    @JoinColumn(name = "idAbonent", referencedColumnName = "idAbonent")
    @ManyToOne
    private Abonent idAbonent;

    public Technicalsupport() {
    }

    public Technicalsupport(Integer idTechnicalSupport) {
        this.idTechnicalSupport = idTechnicalSupport;
    }

    public Integer getIdTechnicalSupport() {
        return idTechnicalSupport;
    }

    public void setIdTechnicalSupport(Integer idTechnicalSupport) {
        this.idTechnicalSupport = idTechnicalSupport;
    }

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal;
    }

    public Abonent getIdAbonent() {
        return idAbonent;
    }

    public void setIdAbonent(Abonent idAbonent) {
        this.idAbonent = idAbonent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTechnicalSupport != null ? idTechnicalSupport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Technicalsupport)) {
            return false;
        }
        Technicalsupport other = (Technicalsupport) object;
        if ((this.idTechnicalSupport == null && other.idTechnicalSupport != null) || (this.idTechnicalSupport != null && !this.idTechnicalSupport.equals(other.idTechnicalSupport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Technicalsupport[ idTechnicalSupport=" + idTechnicalSupport + " ]";
    }
    
}
