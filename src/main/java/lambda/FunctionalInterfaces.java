package lambda;

import vehicles.EngineTypes;
import vehicles.Vehicle;
import vehicles.VehicleSpecifics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {


    public static EngineTypes engineTypeGenerator (Supplier<Integer> supplier){

        Integer ordinalValue = supplier.get();

        for (EngineTypes engineTypes : EngineTypes.values()){
            if(engineTypes.ordinal() == ordinalValue){
                return engineTypes;
            }
        }
        throw new IllegalArgumentException("It's not right");

    }

    public static <E extends Enum<E> & VehicleSpecifics> void process (Consumer<E> processor, List<E> valuesToProcess){

        for(E valueToProcess : valuesToProcess){
            processor.accept(valueToProcess);
        }

    }


    public static <E extends Enum<E> & VehicleSpecifics> void functionParameter(BiFunction<String, Class<E>, E> function, String description, Class<E> clazz){

        System.out.println(function.apply(description, clazz));

    }


    public static <T extends Vehicle> List<T> getBoringVehicles (List<T> allVehicles, Predicate<T> isFun){
        List<T> boringVehicles = new ArrayList<>();
        for (T boringVehicle : allVehicles){
            if (!isFun.test(boringVehicle)){
                boringVehicles.add(boringVehicle);
            }

        }
        return boringVehicles;
    }



}
