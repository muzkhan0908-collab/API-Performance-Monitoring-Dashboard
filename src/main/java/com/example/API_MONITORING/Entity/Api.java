package com.example.API_MONITORING.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "api")
public class Api {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long apiId;

    @Column(name = "api_name")
    private String apiName;

    @Column(name = "endpoint_url")
    private String endpointUrl;

    private String method;

    // Many APIs belong to one User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    // 🔹 Default Constructor
    public Api() {}

    // 🔹 Parameterized Constructor
    public Api(String apiName, String endpointUrl, String method, Users user) {
        this.apiName = apiName;
        this.endpointUrl = endpointUrl;
        this.method = method;
        this.user = user;
    }

    // 🔹 Getters & Setters
    public Long getApiId() {
        return apiId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}