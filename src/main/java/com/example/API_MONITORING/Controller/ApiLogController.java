package com.example.API_MONITORING.Controller;

import com.example.API_MONITORING.Entity.ApiLog;
import com.example.API_MONITORING.Repositories.ApiLogRepository;
import com.example.API_MONITORING.Service.ApiLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
@CrossOrigin(origins = "http://localhost:4200")
public class ApiLogController {

    @Autowired
    private ApiLogService service;

    @Autowired
    private ApiLogRepository apiLogRepository;

    @PostMapping
    public ApiLog addLog(@RequestBody ApiLog log) {
        log.setResponseTime(12);
        return service.saveLog(log);
    }
    @GetMapping("/logs")
    public List<ApiLog> getAllLogs() {
        return apiLogRepository.findAll();
    }
}