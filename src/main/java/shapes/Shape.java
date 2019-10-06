package shapes;

import java.io.IOException;

public class Shape implements Colorable {

    public int colorCode;


    public void render() {
        System.out.println("Shape is rendered colorable.");
    }


    public static class Color {
        private int red;
        private int green;
        private int blue;

        @Override
        public String toString() {
            return "Color{" +
                    "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue +
                    '}';
        }
        public Color(){

        }

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

    public static Shape.Color getDescriptiveColor(final Shape.Color color) {

        class DescriptiveColor extends Shape.Color {


            public String toString() {
                return "You selected color with RGB values" + color;
            }

        }
        return new DescriptiveColor();
    }

    public static class ShapeException extends IOException{

    }


}