package com.demo.microservicesws.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByIdUser", query = "SELECT u FROM User u WHERE u.idUser = :idUser"),
    @NamedQuery(name = "User.findByNameOfUser", query = "SELECT u FROM User u WHERE u.nameOfUser = :nameOfUser"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByTypeOfUser", query = "SELECT u FROM User u WHERE u.typeOfUser = :typeOfUser"),
    @NamedQuery(name = "User.findByStatus", query = "SELECT u FROM User u WHERE u.status = :status")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name_of_user")
    private String nameOfUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "password")
    private String password;
    @Size(max = 15)
    @Column(name = "type_of_user")
    private String typeOfUser;
    @Size(max = 10)
    @Column(name = "status")
    private String status;

    public User() {
    }

    public User(Integer idUser) {
        this.idUser = idUser;
    }

    public User(Integer idUser, String nameOfUser, String password) {
        this.idUser = idUser;
        this.nameOfUser = nameOfUser;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.microservicesws.models.User[ idUser=" + idUser + " ]";
    }
    
}
