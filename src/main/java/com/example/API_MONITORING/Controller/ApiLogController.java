package com.example.API_MONITORING.Controller;

import com.example.API_MONITORING.Entity.ApiLog;
import com.example.API_MONITORING.Service.ApiLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
@CrossOrigin
public class ApiLogController {

    @Autowired
    private ApiLogService service;

    @PostMapping
    public ApiLog addLog(@RequestBody ApiLog log) {
        log.setResponseTime(12);
        return service.saveLog(log);
    }
    @GetMapping("/{apiName}")
    public List<ApiLog> getLogs(@PathVariable String apiName) {
        return service.getLogs(apiName);
    }
}