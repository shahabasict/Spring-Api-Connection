package com.api.WeatherApi.controller;

import com.api.WeatherApi.responses.WeatherResponse;
import com.api.WeatherApi.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Controller {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam String city) {
        System.out.println("Controller Got Called");
        return weatherService.getWeather(city);
    }
}
