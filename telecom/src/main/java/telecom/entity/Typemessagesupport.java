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
@Table(name = "typemessagesupport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typemessagesupport.findAll", query = "SELECT t FROM Typemessagesupport t"),
    @NamedQuery(name = "Typemessagesupport.findByIdTypeMessageSupport", query = "SELECT t FROM Typemessagesupport t WHERE t.idTypeMessageSupport = :idTypeMessageSupport"),
    @NamedQuery(name = "Typemessagesupport.findByName", query = "SELECT t FROM Typemessagesupport t WHERE t.name = :name")})
public class Typemessagesupport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTypeMessageSupport")
    private Integer idTypeMessageSupport;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "typeMessage")
    private Collection<Messagesupport> messagesupportCollection;

    public Typemessagesupport() {
    }

    public Typemessagesupport(Integer idTypeMessageSupport) {
        this.idTypeMessageSupport = idTypeMessageSupport;
    }

    public Integer getIdTypeMessageSupport() {
        return idTypeMessageSupport;
    }

    public void setIdTypeMessageSupport(Integer idTypeMessageSupport) {
        this.idTypeMessageSupport = idTypeMessageSupport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Messagesupport> getMessagesupportCollection() {
        return messagesupportCollection;
    }

    public void setMessagesupportCollection(Collection<Messagesupport> messagesupportCollection) {
        this.messagesupportCollection = messagesupportCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypeMessageSupport != null ? idTypeMessageSupport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typemessagesupport)) {
            return false;
        }
        Typemessagesupport other = (Typemessagesupport) object;
        if ((this.idTypeMessageSupport == null && other.idTypeMessageSupport != null) || (this.idTypeMessageSupport != null && !this.idTypeMessageSupport.equals(other.idTypeMessageSupport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Typemessagesupport[ idTypeMessageSupport=" + idTypeMessageSupport + " ]";
    }
    
}
