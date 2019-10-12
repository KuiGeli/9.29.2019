package lambda;

import vehicles.EngineTypes;

import java.util.function.Supplier;

public class IntGenerator {


    public static EngineTypes engineTypeGenerator (Supplier<Integer> supplier){

        Integer ordinalValue = supplier.get();

        for (EngineTypes engineTypes : EngineTypes.values()){
            if(engineTypes.ordinal() == ordinalValue){
                return engineTypes;
            }
        }
        throw new IllegalArgumentException("It's not right");

    }



}
