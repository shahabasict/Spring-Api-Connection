package com.api.WeatherApi.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("current")
    private Current current;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Location {
        @JsonProperty("name")
        private String name;

        @JsonProperty("region")
        private String region;

        @JsonProperty("country")
        private String country;

        @JsonProperty("lat")
        private double latitude;

        @JsonProperty("lon")
        private double longitude;

        @JsonProperty("tz_id")
        private String timeZone;

        @JsonProperty("localtime_epoch")
        private long localtimeEpoch;

        @JsonProperty("localtime")
        private String localtime;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Current {
        @JsonProperty("last_updated_epoch")
        private long lastUpdatedEpoch;

        @JsonProperty("last_updated")
        private String lastUpdated;

        @JsonProperty("temp_c")
        private double temperatureCelsius;

        @JsonProperty("temp_f")
        private double temperatureFahrenheit;

        @JsonProperty("is_day")
        private int isDay;

        @JsonProperty("condition")
        private Condition condition;

        @JsonProperty("wind_mph")
        private double windMph;

        @JsonProperty("wind_kph")
        private double windKph;

        @JsonProperty("wind_degree")
        private int windDegree;

        @JsonProperty("wind_dir")
        private String windDirection;

        @JsonProperty("pressure_mb")
        private double pressureMb;

        @JsonProperty("pressure_in")
        private double pressureIn;

        @JsonProperty("precip_mm")
        private double precipMm;

        @JsonProperty("precip_in")
        private double precipIn;

        @JsonProperty("humidity")
        private int humidity;

        @JsonProperty("cloud")
        private int cloud;

        @JsonProperty("feelslike_c")
        private double feelsLikeCelsius;

        @JsonProperty("feelslike_f")
        private double feelsLikeFahrenheit;

        @JsonProperty("windchill_c")
        private double windChillCelsius;

        @JsonProperty("windchill_f")
        private double windChillFahrenheit;

        @JsonProperty("heatindex_c")
        private double heatIndexCelsius;

        @JsonProperty("heatindex_f")
        private double heatIndexFahrenheit;

        @JsonProperty("dewpoint_c")
        private double dewPointCelsius;

        @JsonProperty("dewpoint_f")
        private double dewPointFahrenheit;

        @JsonProperty("vis_km")
        private double visibilityKm;

        @JsonProperty("vis_miles")
        private double visibilityMiles;

        @JsonProperty("uv")
        private double uvIndex;

        @JsonProperty("gust_mph")
        private double gustMph;

        @JsonProperty("gust_kph")
        private double gustKph;

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Condition {
            @JsonProperty("text")
            private String text;

            @JsonProperty("icon")
            private String icon;

            @JsonProperty("code")
            private int code;
        }
    }
}
