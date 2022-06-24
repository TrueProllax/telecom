/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telecom.entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 200573
 */
@Entity
@Table(name = "messagesupport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messagesupport.findAll", query = "SELECT m FROM Messagesupport m"),
    @NamedQuery(name = "Messagesupport.findByIdMessageSupport", query = "SELECT m FROM Messagesupport m WHERE m.idMessageSupport = :idMessageSupport"),
    @NamedQuery(name = "Messagesupport.findByMessage", query = "SELECT m FROM Messagesupport m WHERE m.message = :message"),
    @NamedQuery(name = "Messagesupport.findByDateMessage", query = "SELECT m FROM Messagesupport m WHERE m.dateMessage = :dateMessage")})
public class Messagesupport implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMessageSupport")
    private Integer idMessageSupport;
    @Column(name = "message")
    private String message;
    @Column(name = "dateMessage")
    @Temporal(TemporalType.DATE)
    private Date dateMessage;
    @JoinColumn(name = "idAbonent", referencedColumnName = "idAbonent")
    @ManyToOne
    private Abonent idAbonent;
    @JoinColumn(name = "typeMessage", referencedColumnName = "idTypeMessageSupport")
    @ManyToOne
    private Typemessagesupport typeMessage;

    public Messagesupport() {
    }

    public Messagesupport(Integer idMessageSupport) {
        this.idMessageSupport = idMessageSupport;
    }

    public Integer getIdMessageSupport() {
        return idMessageSupport;
    }

    public void setIdMessageSupport(Integer idMessageSupport) {
        this.idMessageSupport = idMessageSupport;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(Date dateMessage) {
        this.dateMessage = dateMessage;
    }

    public Abonent getIdAbonent() {
        return idAbonent;
    }

    public void setIdAbonent(Abonent idAbonent) {
        this.idAbonent = idAbonent;
    }

    public Typemessagesupport getTypeMessage() {
        return typeMessage;
    }

    public void setTypeMessage(Typemessagesupport typeMessage) {
        this.typeMessage = typeMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMessageSupport != null ? idMessageSupport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messagesupport)) {
            return false;
        }
        Messagesupport other = (Messagesupport) object;
        if ((this.idMessageSupport == null && other.idMessageSupport != null) || (this.idMessageSupport != null && !this.idMessageSupport.equals(other.idMessageSupport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "telecom.entity.Messagesupport[ idMessageSupport=" + idMessageSupport + " ]";
    }
    
}
