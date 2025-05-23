package com.code_space.code_space_editor.code_execution.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "code.execution")
public class ExecutionProperties {
    // Execution limits
    private int defaultTimeoutSeconds = 30;
    private int maxTimeoutSeconds = 60;
    private int memoryLimit = 100; // MB
    private String cpuLimit = "0.5"; // CPU cores

    // Output limits
    private int maxOutputSize = 1024 * 1024; // 1MB

    // Rate limiting
    private int maxExecutionsPerMinute = 10;
    private int maxExecutionsPerHour = 100;
}
