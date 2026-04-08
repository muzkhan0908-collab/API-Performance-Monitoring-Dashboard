package com.example.API_MONITORING.Service;

import com.example.API_MONITORING.Entity.ApiLog;
import com.example.API_MONITORING.Repositories.ApiLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiLogService {

    @Autowired
    private ApiLogRepository repo;

    public ApiLog saveLog(ApiLog log) {
        return repo.save(log);
    }

    public List<ApiLog> getLogs(String apiName) {
        return repo.findByApiName(apiName);
    }
}
