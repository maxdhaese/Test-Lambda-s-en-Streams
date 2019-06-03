package be.intecbrussel.lambdatest.model;

import java.util.Random;

public class RandomMeasurementGenerator implements MeasurementGenerator {

    @Override
    public SensorMeasurement generateMeasurement() {
        Random rand = new Random();
        int [] humidity = rand.ints(0,100)
                .toArray();
        int [] lightIntensity = rand.ints(0,10000)
                .toArray();
        int [] temperature = rand.ints(-70,70)
                .toArray();



        return null;
    }
}
