package be.intecbrussel.lambdatest.model;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class MeasurementApp {
    public static void main(String[] args) {
        generateMeasurementArray(3).toString();





    }

    public static SensorMeasurement[] generateMeasurementArray(int numberOfMeasurements) {
        RandomMeasurementGenerator randomMeasurementGenerator = new RandomMeasurementGenerator();

        SensorMeasurement[] sensorMeasurements = new SensorMeasurement[numberOfMeasurements];
        for (int i = 0; i < numberOfMeasurements; i++) {
            sensorMeasurements[i] = randomMeasurementGenerator.generateMeasurement();

        }
        return sensorMeasurements;
    }

    public static void printHighestTemperature(SensorMeasurement[] sensorMeasurements) {


    }

    public static void printSortedByLightIntensity(SensorMeasurement[] sensorMeasurements) {

    }

    public static String[] mapToInfoString(SensorMeasurement[] sensorMeasurements) {
        return null;

    }

    public static void printAverageTemperature(SensorMeasurement[] sensorMeasurements) {

    }


}
