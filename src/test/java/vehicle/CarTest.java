package vehicle;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.Vehicle;

public class CarTest {

    private Vehicle testVehicle;

    @Before
    public void testSetup(){
    testVehicle = new Car(30, false);
    }

    @Test
    public void testMaxSpeed(){

        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();

        for (int i = startSpeed; i<maxSpeed; i++){
            testVehicle.increaseSpeed();
        }
        Assert.assertEquals(maxSpeed, testVehicle.getCurrentSpeed());
    }
    @Test (expected = Vehicle.OverMaxSpeedException.class)
    public void testMaxSpeedCantExceed(){

        int startSpeed = testVehicle.getCurrentSpeed();
        int maxSpeed = testVehicle.getMaxSpeed();

        for (int i = startSpeed; i<=maxSpeed; i++){
            testVehicle.increaseSpeed();
        }

    }




}
