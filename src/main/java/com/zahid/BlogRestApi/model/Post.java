package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
//    private int like;
//    private int dislike;
//    private int status;
//    private int user_id;
//    private String created_at;
//    private String updated_at;

    public Post(){

    }

    public Post(int id, String title, String description, int like, int dislike, int status, int user_id, String created_at, String updated_at) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
//        this.like = like;
//        this.dislike = dislike;
//        this.status = status;
//        this.user_id = user_id;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public int getLike() {
//        return like;
//    }
//
//    public void setLike(int like) {
//        this.like = like;
//    }
//
//    public int getDislike() {
//        return dislike;
//    }
//
//    public void setDislike(int dislike) {
//        this.dislike = dislike;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public int getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(int user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(String created_at) {
//        this.created_at = created_at;
//    }
//
//    public String getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(String updated_at) {
//        this.updated_at = updated_at;
//    }
}
