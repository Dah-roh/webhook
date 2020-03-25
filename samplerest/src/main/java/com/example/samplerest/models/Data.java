package com.example.samplerest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @JsonProperty
    private Long amount;
    @JsonProperty
    private String currency;
    @JsonProperty
    private Date transaction_date;
    @JsonProperty
    private String status;
    @JsonProperty
    private String reference;
    @JsonProperty
    private String domain;
    @JsonProperty
    private int metadata;
    @JsonProperty
    private String gateway_response;
    @JsonProperty
    private String message;
    @JsonProperty("channel")
    private String channelz;
    @JsonProperty
    private String ip_address;
    @OneToOne
    @JsonProperty
    private Log log;
    private String fees;
    @OneToOne
    @JsonIgnore
    private Authorization authorization;
    @OneToOne
    @JsonIgnore
    private Customer customer;
    @JsonProperty
    private String plan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getTransactionDate() {
        return transaction_date;
    }

    public void setTransactionDate(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getMetadata() {
        return metadata;
    }

    public void setMetadata(int metadata) {
        this.metadata = metadata;
    }

    public String getGatewayResponse() {
        return gateway_response;
    }

    public void setGatewayResponse(String gateway_response) {
        this.gateway_response = gateway_response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChannel() {
        return channelz;
    }

    public void setChannel(String channelz) {
        this.channelz = channelz;
    }

    public String getIpAddress() {
        return ip_address;
    }

    public void setIpAddress(String ip_address) {
        this.ip_address = ip_address;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", transaction_date=" + transaction_date +
                ", status='" + status + '\'' +
                ", reference='" + reference + '\'' +
                ", domain='" + domain + '\'' +
                ", metadata=" + metadata +
                ", gateway_response='" + gateway_response + '\'' +
                ", message='" + message + '\'' +
                ", channelz='" + channelz + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", log=" + log +
                ", fees='" + fees + '\'' +
                ", authorization=" + authorization +
                ", customer=" + customer +
                ", plan='" + plan + '\'' +
                '}';
    }

    public Data(Long amount, String currency, Date transaction_date, String status, String reference, String domain, int metadata, String gateway_response, String message, String channelz, String ip_address, Log log, String fees, Authorization authorization, Customer customer, String plan) {
        this.amount = amount;
        this.currency = currency;
        this.transaction_date = transaction_date;
        this.status = status;
        this.reference = reference;
        this.domain = domain;
        this.metadata = metadata;
        this.gateway_response = gateway_response;
        this.message = message;
        this.channelz = channelz;
        this.ip_address = ip_address;
        this.log = log;
        this.fees = fees;
        this.authorization = authorization;
        this.customer = customer;
        this.plan = plan;
    }

    public Data() {
    }
}
