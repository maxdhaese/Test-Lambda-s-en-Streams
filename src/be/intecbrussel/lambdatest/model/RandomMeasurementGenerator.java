package be.intecbrussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.Stream;

public class RandomMeasurementGenerator implements MeasurementGenerator {

    @Override
    public SensorMeasurement generateMeasurement() {
        Random rand = new Random();
        //return an object of SensorMeasurment with random values between limited values
        return new SensorMeasurement(BigDecimal.valueOf(rand.nextInt(100)),
                BigDecimal.valueOf(rand.nextInt(140) - 70),
                BigDecimal.valueOf(rand.nextInt(10000))
        );
    }
}
