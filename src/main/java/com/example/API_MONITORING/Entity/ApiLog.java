package com.example.API_MONITORING.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "api_log")
public class ApiLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "api_name")
    private String apiName;

    private String status;

    @Column(name = "response_time")
    private int responseTime;

    public ApiLog() {}

    public ApiLog(String apiName, String status, int responseTime) {
        this.apiName = apiName;
        this.status = status;
        this.responseTime = responseTime;
    }

    public Long getId() { return id; }

    public String getApiName() { return apiName; }
    public void setApiName(String apiName) { this.apiName = apiName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getResponseTime() { return responseTime; }
    public void setResponseTime(int responseTime) { this.responseTime = responseTime; }
}