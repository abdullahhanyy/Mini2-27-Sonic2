package com.example.miniapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

import java.time.LocalDateTime;

@Document(collection = "ratings")
public class Rating {

    @Id
    private String id;

    private Long entityId;        // ID of captain, customer, or trip
    private String entityType;    // "captain", "customer", or "trip"
    private Integer score;        // Score from 1 to 5
    private String comment;
    private LocalDateTime ratingDate;

    // Default constructor
    public Rating() {}

    // Partial constructor (without ID and date)
    public Rating(Long entityId, String entityType, Integer score, String comment) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.score = score;
        this.comment = comment;
        this.ratingDate = LocalDateTime.now();
    }

    // Full constructor
    public Rating(String id, Long entityId, String entityType, Integer score, String comment, LocalDateTime ratingDate) {
        this.id = id;
        this.entityId = entityId;
        this.entityType = entityType;
        this.score = score;
        this.comment = comment;
        this.ratingDate = ratingDate;
    }

    public Rating(long entityId,String entityType,int score,String comment,LocalDateTime ratingDate){
        this.id = UUID.randomUUID().toString();
        this.entityId = entityId;
        this.score = score;
        this.comment = comment;
        this.ratingDate = ratingDate;
    }


    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(LocalDateTime ratingDate) {
        this.ratingDate = ratingDate;
    }
}
