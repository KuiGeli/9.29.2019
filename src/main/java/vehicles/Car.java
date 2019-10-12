package vehicles;

public class Car extends Vehicle {
    private boolean isConvertible = false;

    private int maxSpeed;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
