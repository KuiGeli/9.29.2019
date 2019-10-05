package shapes;

public interface Colorable {
    int DEFAULT_COLOR_CODE = 0;

    static void describeBehavior(){
        System.out.println("This is colorable");
    }

    default void printFillColor (){
        System.out.println(DEFAULT_COLOR_CODE);
        System.out.println(String.format("Default color code is "));
    }

    abstract void render();


}
