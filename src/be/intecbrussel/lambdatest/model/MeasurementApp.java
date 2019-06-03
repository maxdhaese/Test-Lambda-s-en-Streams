package be.intecbrussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MeasurementApp {
    public static void main(String[] args) {

        printHighestTemperature(generateMeasurementArray(3));





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
        Optional<BigDecimal> max = Stream.of(sensorMeasurements)
                .map(s->s.getTemperatureFahrenheit())
                .max(BigDecimal::compareTo);

        if (max.isPresent()){
            Stream.of(sensorMeasurements)
                    .forEach(System.out::println);
            System.out.printf("The maximum temperature in Celcius is: %.1f degrees\n In Fahrenheit :%.1f F",max.get(),max.get().multiply(new BigDecimal(1.8)).add(BigDecimal.valueOf(32)));
        }


    }

    public static void printSortedByLightIntensity(SensorMeasurement[] sensorMeasurements) {
        Stream.of(sensorMeasurements)
                .sorted()
                .forEach(System.out::println);
    }

    public static String[] mapToInfoString(SensorMeasurement[] sensorMeasurements) {
        return null;

    }

    public static void printAverageTemperature(SensorMeasurement[] sensorMeasurements) {

    }


}
