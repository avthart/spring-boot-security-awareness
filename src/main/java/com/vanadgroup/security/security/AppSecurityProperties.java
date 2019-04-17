package com.vanadgroup.security.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.security")
@Data
public class AppSecurityProperties {

    private String userPassword;

    private String[] userRoles = { "USER" };

    private String adminPassword;

    private String[] adminRoles = { "USER", "ADMIN" };
}
