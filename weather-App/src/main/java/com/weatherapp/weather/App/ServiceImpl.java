package com.weatherapp.weather.App;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
@Slf4j
public class ServiceImpl implements Service{



    @Override
    public CurrentWeather getWeatherBasedOnCity(String city) {
        String URL = "http://api.weatherapi.com/v1/current.json?key=eec7b272a14d4d68bce172252230205&q="+city+"&aqi=no";
        RestTemplate restTemplate = new RestTemplate();
        CurrentWeather currentWeather =  restTemplate.getForObject(URL, CurrentWeather.class);
        log.info("Result -> {}",currentWeather);
        return  currentWeather;
    }
}
