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
            throw this.new overMaxSpeedException();
        }
    }

    public class overMaxSpeedException extends RuntimeException{




    }


}
