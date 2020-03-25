package com.example.samplerest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.mapping.List;

import javax.persistence.*;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty
    private int time_spent;
    @JsonProperty
    private int attempts;
    @JsonProperty
    private String authentication;
    @JsonProperty
    private int errors;
    @JsonProperty
    private boolean success;
    @JsonProperty
    private boolean mobile;
    @JsonProperty
    private List input;
    @JsonProperty("channel")
    private String channl;
    @ManyToOne
    @JsonProperty
    private History history;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTimeSpent() {
        return time_spent;
    }

    public void setTimeSpent(int time_spent) {
        this.time_spent = time_spent;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isMobile() {
        return mobile;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public int getTime_spent() {
        return time_spent;
    }

    public void setTime_spent(int time_spent) {
        this.time_spent = time_spent;
    }

    public List getInput() {
        return input;
    }

    public void setInput(List input) {
        this.input = input;
    }

    public String getChannel() {
        return channl;
    }

    public void setChannel(String channl) {
        this.channl = channl;
    }

    public History getHistory() {
        return history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "{" +
                " time_spent=" + time_spent +
                ", attempts=" + attempts +
                ", authentication='" + authentication + '\'' +
                ", errors=" + errors +
                ", success=" + success +
                ", mobile=" + mobile +
                ", input=" + input +
                ", channl='" + channl + '\'' +
                ", history=" + history +
                '}';
    }

    public Log() {
    }

    public Log(int time_spent, int attempts, String authentication, int errors, boolean success, boolean mobile, List input, String channl, History history) {
        this.time_spent = time_spent;
        this.attempts = attempts;
        this.authentication = authentication;
        this.errors = errors;
        this.success = success;
        this.mobile = mobile;
        this.input = input;
        this.channl = channl;
        this.history = history;
    }
}
