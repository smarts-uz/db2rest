package com.homihq.db2rest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "cors")
public class CorsConfigProperties {

    private boolean enabled;
    private List<CorsMapping> mappings;

    @Data
    public static class CorsMapping {
        private String mapping;
        private String allowedOrigins;
        private String allowedHeaders;
        private String allowedMethods;
    }
}
