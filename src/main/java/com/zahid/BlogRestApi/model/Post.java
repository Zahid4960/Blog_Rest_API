package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "category_id", nullable = false)
    private Integer category_id;

    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    @Column(name = "status", columnDefinition = "integer default 1")
    private Integer status;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at = new Date();

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at = new Date();

    public Post(Integer id, String title, String description, Integer category_id, Integer user_id, Integer status, Date created_at, Date updated_at){
        this.id = id;
        this.title = title;
        this.description = description;
        this.category_id = category_id;
        this.user_id = user_id;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Post(){

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer Id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Integer getCategoryId(){
        return category_id;
    }

    public void setCategoryId(Integer category_id){
        this.category_id = category_id;
    }

    public Integer getUserId(){
        return user_id;
    }

    public void setUserId(Integer user_id){
        this.user_id = user_id;
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
