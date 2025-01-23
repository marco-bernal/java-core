package com.mab.core.configuration.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "utils.json.load")
public class JsonFileProperties {

    private String carFileName;
    private String employeesFileName;
    private String nbaPlayersFileName;
    private String peopleFileName;
}
