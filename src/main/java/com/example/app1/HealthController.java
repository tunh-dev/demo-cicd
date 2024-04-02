package com.example.app1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {
    @Value("${APPLICATION_VERSION}")
    private String version;

    @GetMapping()
    public String health() {
        return "OK";
    }

    @GetMapping("/version")
    public String version() {
        return version;
    }
}
