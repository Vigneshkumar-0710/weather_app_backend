package com.weatherapp.weather.App;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/city")
    public CurrentWeather getWeatherBasedOnCity(@RequestParam String city){
        return service.getWeatherBasedOnCity(city);
    }
}
