package com.example.samplerest.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authorization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty
    private String authorization_code;
    @JsonProperty
    private String card_type;
    @JsonProperty
    private String last4;
    @JsonProperty
    private String exp_month;
    @JsonProperty
    private String exp_year;
    @JsonProperty
    private String bin;
    @JsonProperty
    private String bank;
    @JsonProperty
    private String channels;
    @JsonProperty
    private boolean reusable;
    @JsonProperty
    private String country_code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthrizationCode() {
        return authorization_code;
    }

    public void setAuthrizationCode(String authorization_code) {
        this.authorization_code = authorization_code;
    }

    public String getCardType() {
        return card_type;
    }

    public void setCardType(String card_type) {
        this.card_type = card_type;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getExpiringMonth() {
        return exp_month;
    }

    public void setExpiringMonth(String exp_month) {
        this.exp_month = exp_month;
    }

    public String getExpiringYear() {
        return exp_year;
    }

    public void setExpiringYear(String exp_year) {
        this.exp_year = exp_year;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getChannel() {
        return channels;
    }

    public void setChannel(String channels) {
        this.channels = channels;
    }

    public boolean isReusable() {
        return reusable;
    }

    public void setReusable(boolean reusable) {
        this.reusable = reusable;
    }

    public String getCountryCode() {
        return country_code;
    }

    public void setCountryCode(String country_code) {
        this.country_code = country_code;
    }

    @Override
    public String toString() {
        return "{" +
                "authorization_code='" + authorization_code + '\'' +
                ", card_type='" + card_type + '\'' +
                ", last4='" + last4 + '\'' +
                ", exp_month='" + exp_month + '\'' +
                ", exp_year='" + exp_year + '\'' +
                ", bin='" + bin + '\'' +
                ", bank='" + bank + '\'' +
                ", channels='" + channels + '\'' +
                ", reusable=" + reusable +
                ", country_code='" + country_code + '\'' +
                '}';
    }

    public Authorization(String authorization_code, String card_type, String last4, String exp_month, String exp_year, String bin, String bank, String channels, boolean reusable, String country_code) {
        this.authorization_code = authorization_code;
        this.card_type = card_type;
        this.last4 = last4;
        this.exp_month = exp_month;
        this.exp_year = exp_year;
        this.bin = bin;
        this.bank = bank;
        this.channels = channels;
        this.reusable = reusable;
        this.country_code = country_code;
    }

    public Authorization() {
    }
}
