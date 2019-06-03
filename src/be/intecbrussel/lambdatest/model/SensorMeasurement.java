package be.intecbrussel.lambdatest.model;

import java.math.BigDecimal;

public class SensorMeasurement {
    private BigDecimal humidity;
    private BigDecimal temperature;
    private BigDecimal lightIntensity;

    public SensorMeasurement(BigDecimal humidity, BigDecimal temperature, BigDecimal lightIntensity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.lightIntensity = lightIntensity;
    }

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
        return temperature;
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
