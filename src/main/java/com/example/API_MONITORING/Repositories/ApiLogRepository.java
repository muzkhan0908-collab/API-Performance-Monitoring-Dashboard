package com.example.API_MONITORING.Repositories;

import com.example.API_MONITORING.Entity.ApiLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiLogRepository extends JpaRepository<ApiLog, Long> {
    List<ApiLog> findByApiName(String apiName);
}