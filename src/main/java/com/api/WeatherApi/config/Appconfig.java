package com.api.WeatherApi.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "weatherapi")
public class Appconfig {

    private String baseUrl;
    private String apiKey;

    @Bean
    public RestClient restClient(){
        return RestClient.create(baseUrl);
    }
}
