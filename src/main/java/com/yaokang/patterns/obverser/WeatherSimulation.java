package com.yaokang.patterns.obverser;

public class WeatherSimulation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(10, 10, 10);
        weatherData.setMeasurements(20, 20, 20);
        weatherData.setMeasurements(30, 30, 30);
    }
}
