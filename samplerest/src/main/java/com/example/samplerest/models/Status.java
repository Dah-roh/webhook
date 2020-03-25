package com.example.samplerest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @JsonProperty
    private boolean status;
    @JsonProperty("message")
    private String messages;
    @ManyToOne
    @JsonProperty
    private Data data;

    public Status(boolean status, String messages, Data data) {
        this.status = status;
        this.messages = messages;
        this.data = data;
    }

    public Status() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return messages;
    }

    public void setMessage(String messages) {
        this.messages = messages;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "status=" + status +
                ", messages='" + messages + '\'' +
                ", data=" + data +
                '}';
    }
}
