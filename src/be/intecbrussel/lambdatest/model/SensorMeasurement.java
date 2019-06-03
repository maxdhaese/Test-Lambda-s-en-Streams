package be.intecbrussel.lambdatest.model;

import java.math.BigDecimal;

public class SensorMeasurement {
    private BigDecimal humidity;
    private BigDecimal temperature;
    private BigDecimal lightIntensity;

    //create constructor
    public SensorMeasurement(BigDecimal humidity, BigDecimal temperature, BigDecimal lightIntensity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.lightIntensity = lightIntensity;
    }
    //getters
    public BigDecimal getHumidity() {
        return humidity;
    }

    public BigDecimal getLightIntensity() {
        return lightIntensity;
    }

    public BigDecimal getTemperatureCelcius() {
        return temperature;
    }

    public BigDecimal getTemperatureFahrenheit() {
        return temperature.multiply(new BigDecimal(1.8)).add(BigDecimal.valueOf(32));
    }

    @Override
    public String toString() {
        return "SensorMeasurement{" +
                "humidity=" + humidity +
                ", temperature=" + temperature +
                ", lightIntensity=" + lightIntensity +
                '}';
    }
}
