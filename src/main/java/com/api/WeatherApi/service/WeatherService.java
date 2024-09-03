package com.api.WeatherApi.service;


import com.api.WeatherApi.config.Appconfig;
import com.api.WeatherApi.responses.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestClient restClient;
    private final Appconfig appconfig;

    public WeatherResponse getWeather(String city){
        System.out.println("Weather Service is Called");
        String url = String.format("%s/current.json?key=%s&q=%s",
                appconfig.getBaseUrl(),appconfig.getApiKey(),city);
        return restClient.get().uri(url).retrieve().body(WeatherResponse.class);
    }



}
