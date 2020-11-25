package com.zahid.BlogRestApi.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "upvote", nullable = false, columnDefinition = "integer default 0")
    private int upvote;

    @Column(name = "dislike", nullable = false, columnDefinition = "integer default 0")
    private int dislike;

    @Column(name = "user_id", nullable = false)
    private int user_id;

    @Column(name = "status", nullable = false, )
    private int status;

    @Column(name = "created_at", nullable = true)
    private String created_at;

    @Column(name = "updated_at", nullable = true)
    private String updated_at;

    public Post(){

    }

    public Post(int id, String title, String description, int upvote, int dislike, int user_id, int status, String created_at, String updated_at) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.upvote = upvote;
        this.dislike = dislike;
        this.user_id = user_id;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public int getupvote() {
        return upvote;
    }

    public void setupvote(int upvote) {
        this.upvote = upvote;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
