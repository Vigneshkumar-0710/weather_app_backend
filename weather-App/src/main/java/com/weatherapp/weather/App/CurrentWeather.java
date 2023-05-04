package com.weatherapp.weather.App;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrentWeather {
    private Location location;
    private Current current;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
 class Location {
    private String name;
    private String region;
    private String country;
    private Long localtime_epoch;
    private String localtime;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
 class Current {
    private Long last_updated_epoch;
    private Double temp_c;
    private Double temp_f;
    private Condition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Double wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Double humidity;
    private Double cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double vis_km;
    private Double vis_miles;
    private Double uv;
    private Double gust_mph;
    private Double gust_kph;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Condition {
    private String text;
    private String icon;
    private int code;
}

