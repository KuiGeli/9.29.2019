package lambda;

import com.google.common.collect.ImmutableList;
import generics.Utils;

import org.w3c.dom.ls.LSOutput;
import vehicles.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Main {




    public static <E extends  Enum<E> & VehicleSpecifics, T extends Vehicle> void main(String[] args) throws ClassNotFoundException {

        Predicate<Vehicle> isFun = (vehicle) -> {return vehicle.getMaxSpeed() > 150;};

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(200));
        vehicles.add(new Vehicle(300));
        vehicles.add(new Vehicle(400));
        vehicles.add(new Vehicle(110));
        vehicles.add(new Vehicle(130));
        vehicles.add(new Car(300));

        Vehicle vehicle = new Vehicle(200);

        List<Vehicle> boringVehicles = new ArrayList<>();

        boringVehicles.addAll(FunctionalInterfaces.getBoringVehicles(vehicles, isFun));

        List<Vehicle> funVehicles = new ArrayList<>();

        funVehicles.addAll(vehicles);
        funVehicles.removeAll(boringVehicles);

        System.out.println("Boring " +boringVehicles);
        System.out.println("Fun " +funVehicles);



        System.out.println();


        System.out.println(isFun.test(vehicle));

        BiFunction<String, Class<E>, E> myBiFunction = (description, enumType) -> Utils.mapBasedOnDescription(description, enumType);

        FunctionalInterfaces.functionParameter(myBiFunction, "petrol",(Class<E>) Class.forName("vehicles.EngineTypes"));




//       Consumer<E> consumer = (enumInstance) -> {
//           System.out.println(enumInstance.getDescription());
//        };
//
//       List<E> enumValues = new ArrayList<>();
//       enumValues.addAll(Arrays.asList((E[])GearboxTypes.values()));
//       enumValues.addAll(Arrays.asList((E[])EngineTypes.values()));
//       FunctionalInterfaces.process(consumer, enumValues);





//        Supplier<Integer> supplier = () -> {
//            Random random = new Random();
//        return random.nextInt(EngineTypes.values().length);
//        };
//
//        List<EngineTypes> engineTypes = new ArrayList<>();
//
//        for (int i = 0; i<1000; i++){
//            engineTypes.add(FunctionalInterfaces.engineTypeGenerator(supplier));
//        }
//
//        int dieselCount = 0, petrolCount = 0, hybridCount = 0, electricCount = 0;
//
//
//        for (EngineTypes engineType : engineTypes){
//
//            if(engineType.getDescription().equalsIgnoreCase("diesel")){
//                dieselCount++;
//            }else if(engineType.getDescription().equalsIgnoreCase("petrol")){
//                petrolCount++;
//            }else if(engineType.getDescription().equalsIgnoreCase("hybrid")){
//                hybridCount++;
//            }else {
//                electricCount++;
//            }
//
//
//        }
//        System.out.println(String.format("Diesel = %S , petrol = %S , hybrid = %S , electric = %S", String.valueOf(dieselCount), String.valueOf(petrolCount), String.valueOf(hybridCount), String.valueOf(electricCount)));
//
//
//
    }

}
