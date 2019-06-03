package be.intecbrussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.Stream;

public class RandomMeasurementGenerator implements MeasurementGenerator {

    @Override
    public SensorMeasurement generateMeasurement() {
        Random rand = new Random();
        int low = -70;
        int high = 70;



        return new SensorMeasurement(BigDecimal.valueOf(rand.nextInt(100)),
                BigDecimal.valueOf(rand.nextInt(10000)),
                BigDecimal.valueOf(rand.nextInt(high-low)+high));
    }
}
