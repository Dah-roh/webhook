package com.example.samplerest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty
    private String type;
    @JsonProperty
    private String message;
    @JsonProperty
    private int time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return
                "{" +
                        "type='" + type + '\'' +
                        ", message='" + message + '\'' +
                        ", time=" + time +
                        "}";
    }

    public History() {
    }

    public History(String type, String message, int time) {
        this.type = type;
        this.message = message;
        this.time = time;
    }
}
