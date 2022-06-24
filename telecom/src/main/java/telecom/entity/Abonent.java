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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "abonent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abonent.findAll", query = "SELECT a FROM Abonent a"),
    @NamedQuery(name = "Abonent.findByIdAbonent", query = "SELECT a FROM Abonent a WHERE a.idAbonent = :idAbonent"),
    @NamedQuery(name = "Abonent.findByNumber", query = "SELECT a FROM Abonent a WHERE a.number = :number"),
    @NamedQuery(name = "Abonent.findByPersonalAccount", query = "SELECT a FROM Abonent a WHERE a.personalAccount = :personalAccount"),
    @NamedQuery(name = "Abonent.findByEmail", query = "SELECT a FROM Abonent a WHERE a.email = :email"),
    @NamedQuery(name = "Abonent.findByUser", query = "SELECT a FROM Abonent a WHERE a.idUser = :idUser"),
    @NamedQuery(name = "Abonent.findByUserSurname", query = "SELECT a FROM Abonent a WHERE a.idUser.surname like :surname"),
    @NamedQuery(name = "Abonent.findByUserStreetHouse", query = "SELECT a FROM Abonent a WHERE a.address.street = :street and a.address.house = :house"),
    @NamedQuery(name = "Abonent.findByUserStreet", query = "SELECT a FROM Abonent a WHERE a.address.street = :street"),
    @NamedQuery(name = "Abonent.findByPersonalAccountLike", query = "SELECT a FROM Abonent a WHERE a.personalAccount like :personalAccount"),
    @NamedQuery(name = "Abonent.findByContract", query = "SELECT a FROM Abonent a WHERE a.contact = :contact")
})
public class Abonent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAbonent")
    private Integer idAbonent;
    @Column(name = "number")
    private String number;
    @Column(name = "personalAccount")
    private Integer personalAccount;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "idAbonent")
    private Collection<Technicalsupport> technicalsupportCollection;
    @OneToMany(mappedBy = "idAbonent")
    private Collection<Messagesupport> messagesupportCollection;
    @JoinColumn(name = "address", referencedColumnName = "idAddress")
    @ManyToOne
    private Address address;
    @JoinColumn(name = "contact", referencedColumnName = "idContract")
    @ManyToOne
    private Contract contact;
    @JoinColumn(name = "passport", referencedColumnName = "idDataPassport")
    @ManyToOne
    private Datapassport passport;
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    @ManyToOne
    private User idUser;
    @OneToMany(mappedBy = "idAbonent")
    private Collection<Service> serviceCollection;
    @OneToMany(mappedBy = "idAbonent")
    private Collection<Equipmentabonent> equipmentabonentCollection;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Integer personalAccount) {
        this.personalAccount = personalAccount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Technicalsupport> getTechnicalsupportCollection() {
        return technicalsupportCollection;
    }

    public void setTechnicalsupportCollection(Collection<Technicalsupport> technicalsupportCollection) {
        this.technicalsupportCollection = technicalsupportCollection;
    }

    @XmlTransient
    public Collection<Messagesupport> getMessagesupportCollection() {
        return messagesupportCollection;
    }

    public void setMessagesupportCollection(Collection<Messagesupport> messagesupportCollection) {
        this.messagesupportCollection = messagesupportCollection;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contract getContact() {
        return contact;
    }

    public void setContact(Contract contact) {
        this.contact = contact;
    }

    public Datapassport getPassport() {
        return passport;
    }

    public void setPassport(Datapassport passport) {
        this.passport = passport;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Collection<Service> getServiceCollection() {
        return serviceCollection;
    }

    public void setServiceCollection(Collection<Service> serviceCollection) {
        this.serviceCollection = serviceCollection;
    }

    @XmlTransient
    public Collection<Equipmentabonent> getEquipmentabonentCollection() {
        return equipmentabonentCollection;
    }

    public void setEquipmentabonentCollection(Collection<Equipmentabonent> equipmentabonentCollection) {
        this.equipmentabonentCollection = equipmentabonentCollection;
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
