package vehicles;

public class Vehicle extends Exception {


   protected int currentSpeed;

    protected int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void increaseSpeed(){
        currentSpeed++;
        if(currentSpeed > maxSpeed){
            throw this.new OverMaxSpeedException("MaxSpeed Exceeded!!!");
        }
    }

    public class OverMaxSpeedException extends RuntimeException{

        public OverMaxSpeedException(String message) {
            super(message);
        }

    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
