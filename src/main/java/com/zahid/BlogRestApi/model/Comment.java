package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column(length = 500)
    private String comment;

    @Column
    private Integer userId;

    @Column
    private Integer postId;

    @Column(columnDefinition = "Integer default 1")
    private Integer status;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt = new Date();

    public Comment(){

    }

    public Comment(Integer Id, String comment, Integer userId, Integer postId, Integer status, Date createdAt, Date updatedAt){
        this.id = id;
        this.comment = comment;
        this.userId = userId;
        this.postId = postId;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getPostId(){
        return postId;
    }

    public void setPostId(Integer postId){
        this.postId = postId;
    }

    public Integer getStatus(){
        return status;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Date getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(Date updated_at){
        this.updatedAt = updatedAt;
    }
}
