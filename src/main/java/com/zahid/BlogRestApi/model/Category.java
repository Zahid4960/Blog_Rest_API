package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category_name", nullable = false)
    private String category_name;

    @Column(name = "status", nullable = false, columnDefinition = "Integer default 1")
    private Integer status;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at = new Date();

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at = new Date();

    public Category(){

    }

    public Category(Integer id, String category_name, Integer status, Date created_at, Date updated_at){
        this.id = id;
        this.category_name = category_name;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer Id){
        this.id = id;
    }

    public String getCategoryName(){
        return category_name;
    }

    public void setCategoryName(String category_name){
        this.category_name = category_name;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Date getCreatedAt(){
        return created_at;
    }

    public void setCreatedAt(Date created_at){
        this.created_at = created_at;
    }

    public Date getUpdatedAt(){
        return updated_at;
    }

    public void setUpdatedAt(Date updated_at){
        this.updated_at = updated_at;
    }
}
