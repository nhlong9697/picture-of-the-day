package com.picture.model;


import javax.persistence.*;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private String authorName;
    private String comment;
    private int likes;

    public Comment() {
    }

    public Comment(Long id, int score, String authorName, String comment, int likes) {
        this.id = id;
        this.score = score;
        this.authorName = authorName;
        this.comment = comment;
        this.likes = likes;
    }

    public Comment(int score, String authorName, String comment, int likes) {
        this.score = score;
        this.authorName = authorName;
        this.comment = comment;
        this.likes = likes;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
