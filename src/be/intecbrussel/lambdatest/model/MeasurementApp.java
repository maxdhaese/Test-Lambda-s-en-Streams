package be.intecbrussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class MeasurementApp {
    public static void main(String[] args) {

        System.out.println("---Print highest temperature---");
        printHighestTemperature(generateMeasurementArray(3));
        System.out.println();

        System.out.println("---Print sorted by lightIntensity---");
        printSortedByLightIntensity(generateMeasurementArray(3));

        System.out.println("---Map to info string---");
        mapToInfoString(generateMeasurementArray(3));

        System.out.println("---Print average Temperature---");
        printAverageTemperature(generateMeasurementArray(3));








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
                .map(SensorMeasurement::getTemperatureCelcius)
                .max(BigDecimal::compareTo);

        if (max.isPresent()){
            Stream.of(sensorMeasurements)
                    .forEach(System.out::println);
            System.out.printf("The maximum temperature in Celcius is: %.1f degrees and in Fahrenheit :%.1f F",max.get(),max.get().multiply(new BigDecimal(1.8)).add(BigDecimal.valueOf(32)));
        }


    }

    public static void printSortedByLightIntensity(SensorMeasurement[] sensorMeasurements) {
        Stream.of(sensorMeasurements)
                .sorted(Comparator.comparing(s->s.getLightIntensity().doubleValue()))
                .forEach(System.out::println);

    }

    public static String[] mapToInfoString(SensorMeasurement[] sensorMeasurements) {


        String[] string = Stream.of(sensorMeasurements)
                .map(s-> String.format("humidity: %d %; LightIntensity: %dlumen; Temperature: %.1f degrees Celcius(%.1f Fahrenheit)",s.getHumidity(),s.getLightIntensity(),s.getTemperatureCelcius(),s.getTemperatureFahrenheit()))
                .toString()
                .



        return string ;

    }


    public static void printAverageTemperature(SensorMeasurement[] sensorMeasurements) {
        OptionalDouble avg = Stream.of(sensorMeasurements)
                .mapToDouble(s->s.getTemperatureCelcius().doubleValue())
                .average();

        if (avg.isPresent()){
            Stream.of(sensorMeasurements)
                    .forEach(System.out::println);
            System.out.printf("The average temperature in Celcius is: %.1f degrees and in Fahrenheit :%.1f F",avg.getAsDouble(),(avg.getAsDouble()*1.8+32));
        }

    }


}
