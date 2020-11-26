package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "encrypted_password", nullable = false)
    private String encrypted_password;

    @Column(name = "plain_password", nullable = false)
    private String plain_password;

    @Column(name = "status", columnDefinition = "integer default 1")
    private Integer status;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at = new Date();

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at = new Date();


    public User(){

    }

    public User(Integer id, String email, String username, String encrypted_password, String plain_password, Integer status, Date created_at, Date updated_at){
        this.id = id;
        this.email = email;
        this.username = username;
        this.encrypted_password = encrypted_password;
        this.plain_password = plain_password;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }

    public  void setEmail(String email){
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public String getPlain_password() {
        return plain_password;
    }

    public void setPlain_password(String plain_password) {
        this.plain_password = plain_password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}
