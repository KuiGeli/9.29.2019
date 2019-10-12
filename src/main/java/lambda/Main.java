package lambda;

import vehicles.EngineTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
        return random.nextInt(EngineTypes.values().length);
        };

        List<EngineTypes> engineTypes = new ArrayList<>();

        for (int i = 0; i<100; i++){
            engineTypes.add(IntGenerator.engineTypeGenerator(supplier));
        }

        int dieselCount = 0, petrolCount = 0, hybridCount = 0, electricCount = 0;


        for (EngineTypes engineType : engineTypes){

            if(engineType.getDescription().equalsIgnoreCase("diesel")){
                dieselCount++;
            }else if(engineType.getDescription().equalsIgnoreCase("petrol")){
                petrolCount++;
            }else if(engineType.getDescription().equalsIgnoreCase("hybrid")){
                hybridCount++;
            }else {
                electricCount++;
            }


        }
        System.out.println(String.format("Diesel = %S , petrol = %S , hybrid = %S , electric = %S", String.valueOf(dieselCount), String.valueOf(petrolCount), String.valueOf(hybridCount), String.valueOf(electricCount)));



    }

}
