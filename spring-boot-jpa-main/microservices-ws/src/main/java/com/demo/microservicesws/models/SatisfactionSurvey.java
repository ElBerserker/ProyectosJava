/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.microservicesws.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author berserker
 */
@Entity
@Table(name = "satisfaction_survey")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SatisfactionSurvey.findAll", query = "SELECT s FROM SatisfactionSurvey s"),
    @NamedQuery(name = "SatisfactionSurvey.findByIdSatisfactionSurvey", query = "SELECT s FROM SatisfactionSurvey s WHERE s.idSatisfactionSurvey = :idSatisfactionSurvey"),
    @NamedQuery(name = "SatisfactionSurvey.findByLevelOfSatisfaction", query = "SELECT s FROM SatisfactionSurvey s WHERE s.levelOfSatisfaction = :levelOfSatisfaction"),
    @NamedQuery(name = "SatisfactionSurvey.findByFolioTicket", query = "SELECT s FROM SatisfactionSurvey s WHERE s.folioTicket = :folioTicket"),
    @NamedQuery(name = "SatisfactionSurvey.findByDateAndTime", query = "SELECT s FROM SatisfactionSurvey s WHERE s.dateAndTime = :dateAndTime")})
public class SatisfactionSurvey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_satisfaction_survey")
    private Integer idSatisfactionSurvey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "level_of_satisfaction")
    private int levelOfSatisfaction;
    @Lob
    @Size(max = 65535)
    @Column(name = "coment")
    private String coment;
    @Size(max = 18)
    @Column(name = "folio_ticket")
    private String folioTicket;
    @Column(name = "date_and_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAndTime;

    public SatisfactionSurvey() {
    }

    public SatisfactionSurvey(Integer idSatisfactionSurvey) {
        this.idSatisfactionSurvey = idSatisfactionSurvey;
    }

    public SatisfactionSurvey(Integer idSatisfactionSurvey, int levelOfSatisfaction) {
        this.idSatisfactionSurvey = idSatisfactionSurvey;
        this.levelOfSatisfaction = levelOfSatisfaction;
    }

    public Integer getIdSatisfactionSurvey() {
        return idSatisfactionSurvey;
    }

    public void setIdSatisfactionSurvey(Integer idSatisfactionSurvey) {
        this.idSatisfactionSurvey = idSatisfactionSurvey;
    }

    public int getLevelOfSatisfaction() {
        return levelOfSatisfaction;
    }

    public void setLevelOfSatisfaction(int levelOfSatisfaction) {
        this.levelOfSatisfaction = levelOfSatisfaction;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public String getFolioTicket() {
        return folioTicket;
    }

    public void setFolioTicket(String folioTicket) {
        this.folioTicket = folioTicket;
    }

    public Date getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSatisfactionSurvey != null ? idSatisfactionSurvey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SatisfactionSurvey)) {
            return false;
        }
        SatisfactionSurvey other = (SatisfactionSurvey) object;
        if ((this.idSatisfactionSurvey == null && other.idSatisfactionSurvey != null) || (this.idSatisfactionSurvey != null && !this.idSatisfactionSurvey.equals(other.idSatisfactionSurvey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.microservicesws.models.SatisfactionSurvey[ idSatisfactionSurvey=" + idSatisfactionSurvey + " ]";
    }
    
}
