package number;

import java.lang.reflect.Array;


public class TestNumber {




    public static void main(String[] args) {

        Number[] numbers = new Number[]{(int) 15, (byte) 1, (float) 20.20, (double) 100.13};
        System.out.println(addNumbers(numbers));


    }
    public static double addNumbers(Number[] numbers) {
        double sum = 0;

        for (Number number : numbers) {

            sum = sum + number.doubleValue();

        }

        return sum;
    }




}