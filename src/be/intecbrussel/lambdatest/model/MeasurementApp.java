package be.intecbrussel.lambdatest.model;

import java.util.stream.Stream;

public class MeasurementApp {
    public static void main(String[] args) {
        RandomMeasurementGenerator randomMeasurementGenerator = new RandomMeasurementGenerator();
        System.out.println(randomMeasurementGenerator.generateMeasurement());



    }

    public static SensorMeasurement [] generateMeasurementArray(int numberOfMeasurements){
        RandomMeasurementGenerator randomMeasurementGenerator = new RandomMeasurementGenerator();



        return null;
    }

    public static void printHighestTemperature(SensorMeasurement[] sensorMeasurements){

    }

    public static void printSortedByLightIntensity(SensorMeasurement [] sensorMeasurements){

    }

    public static String[] mapToInfoString(SensorMeasurement[] sensorMeasurements){
        return null;

    }

    public static void printAverageTemperature(SensorMeasurement [] sensorMeasurements){

    }




}
