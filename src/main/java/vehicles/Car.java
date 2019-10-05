package vehicles;

public class Car extends Vehicle {
    private boolean isConvertible = false;

    private int maxSpeed;

    public Car(int maxSpeed, boolean isConvertible) {
        super(maxSpeed);
        this.isConvertible = isConvertible;
    }




    public boolean isConvertible() {
        return isConvertible;
    }


}
