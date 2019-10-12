package generics;

import com.google.common.collect.ImmutableList;
import vehicles.*;

import java.util.List;

public class Utils {


    private Utils(){

    }



    public static void main(String[] args) {


        System.out.println(mapBasedOnDescription("double clutch", GearboxTypes.class));


//        List<Vehicle> vehicles = ImmutableList.<Vehicle>builder()
//                .add(new Vehicle(15))
//                .add(new Vehicle(150))
//                .add(new Vehicle(200))
//                .build();
//
//        List<Car> cars = ImmutableList.<Car>builder()
//                .add(new Car(15))
//                .add(new Car(200))
//                .add(new Car(400))
//                .build();

//        System.out.println(findFastestVehicle(vehicles));
//
//        System.out.println(findFastestCar(cars));

//
//        System.out.println(fastestVehicle(vehicles));
//        System.out.println(fastestVehicle(cars));



    }


    static <E extends Enum<E> & VehicleSpecifics> E mapBasedOnDescription (String description, Class<E> clazz){
        for(E type : clazz.getEnumConstants()){
            if(type.getDescription().equalsIgnoreCase(description)){
                return type;
            }
        }
        throw new  IllegalArgumentException(String.format("Cannot map '%s' to any known enum", description));
    }



    public static Vehicle findFastestVehicle(List<Vehicle> vehicles){

        Vehicle fastestVehicle = new Vehicle(0);

        for (Vehicle vehicle : vehicles){

            if(vehicle.getMaxSpeed() > fastestVehicle.getMaxSpeed()){
                fastestVehicle = vehicle;
            }

        }
        return fastestVehicle;

    }

    public static Car findFastestCar(List<Car> cars){

        Car fastestCar = new Car(0);

        for (Car car : cars){

            if(car.getMaxSpeed() > fastestCar.getMaxSpeed()){
                fastestCar = car;
            }

        }
        return fastestCar;

    }

    static <T extends Vehicle> Vehicle fastestVehicle (List<T> driveables){

        Vehicle fastestVehicle = new Vehicle(0);

        for (T driveable : driveables){

            if(driveable.getMaxSpeed() > fastestVehicle.getMaxSpeed()){
                fastestVehicle = driveable;
            }

        }
        return fastestVehicle;

    }

}
