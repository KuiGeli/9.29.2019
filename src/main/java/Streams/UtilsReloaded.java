package Streams;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilsReloaded {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(200));
        vehicles.add(new Vehicle(300));
        vehicles.add(new Vehicle(400));
        vehicles.add(new Vehicle(110));
        vehicles.add(new Vehicle(130));

       Stream<String> testStream = vehicles.stream()
                .map(vehicle -> {

                        String strValue = vehicle.toString();
        System.out.println(strValue);
        return strValue;
        });

        System.out.println("Dupa operatie intermediala");

        List<String> result = testStream.collect(Collectors.toList());//After terminal operation the stream closes

    }




}
