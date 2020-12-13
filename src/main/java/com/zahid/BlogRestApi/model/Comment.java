package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "comment", nullable = false, length = 500)
    private String comment;

    @Column(name = "user_id", nullable = false)
    private Integer user_id;

    @Column(name = "post_id", nullable = false)
    private Integer post_id;

    @Column(name = "status", nullable = false, columnDefinition = "Integer default 1")
    private Integer status;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at = new Date();

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at = new Date();

    public Comment(){

    }

    public Comment(Integer Id, String comment, Integer user_id, Integer post_id, Integer status, Date created_at, Date updated_at){
        this.id = id;
        this.comment = comment;
        this.user_id = user_id;
        this.post_id = post_id;
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

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public Integer getUserId(){
        return user_id;
    }

    public void setUserId(){
        this.user_id = user_id;
    }

    public Integer getPostId(){
        return post_id;
    }

    public void setPostId(Integer post_id){
        this.post_id = post_id;
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
