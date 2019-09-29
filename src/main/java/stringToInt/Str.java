package stringToInt;

public class Str {

    static private String numbers = "15, 23, 60";
    static private String[] parts = numbers.split(", ");
    static int sum = 0;


    public static int sum (){

        for (String part : parts){
            sum += Integer.parseInt(part);

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sum());
    }


}
