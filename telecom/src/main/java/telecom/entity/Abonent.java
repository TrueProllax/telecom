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
@Table(name = "abonent")
@NamedQueries({
    @NamedQuery(name = "Abonent.findAll", query = "SELECT a FROM Abonent a"),
    @NamedQuery(name = "Abonent.findByIdAbonent", query = "SELECT a FROM Abonent a WHERE a.idAbonent = :idAbonent"),
    @NamedQuery(name = "Abonent.findByPersonalAccount", query = "SELECT a FROM Abonent a WHERE a.personalAccount = :personalAccount")})
public class Abonent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAbonent")
    private Integer idAbonent;
    @Column(name = "personalAccount")
    private Integer personalAccount;
    @OneToMany(mappedBy = "idAbonent")
    private Collection<Technicalsupport> technicalsupportCollection;
    @JoinColumn(name = "idAddress", referencedColumnName = "idAddress")
    @ManyToOne
    private Address idAddress;
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    @ManyToOne
    private User idUser;

    public Abonent() {
    }

    public Abonent(Integer idAbonent) {
        this.idAbonent = idAbonent;
    }

    public Integer getIdAbonent() {
        return idAbonent;
    }

    public void setIdAbonent(Integer idAbonent) {
        this.idAbonent = idAbonent;
    }

    public Integer getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Integer personalAccount) {
        this.personalAccount = personalAccount;
    }

    public Collection<Technicalsupport> getTechnicalsupportCollection() {
        return technicalsupportCollection;
    }

    public void setTechnicalsupportCollection(Collection<Technicalsupport> technicalsupportCollection) {
        this.technicalsupportCollection = technicalsupportCollection;
    }

    public Address getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Address idAddress) {
        this.idAddress = idAddress;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAbonent != null ? idAbonent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abonent)) {
            return false;
        }
        Abonent other = (Abonent) object;
        if ((this.idAbonent == null && other.idAbonent != null) || (this.idAbonent != null && !this.idAbonent.equals(other.idAbonent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Abonent[ idAbonent=" + idAbonent + " ]";
    }
    
}
