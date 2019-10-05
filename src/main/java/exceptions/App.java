package exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class App {

    static {

    }

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try {

            System.out.println(division(1, 2));

            System.out.println(division(1, 0));

        } catch (IOException e) {
            LOGGER.error("A fost prinsa exceptia cu mesajul '{}'.", e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }


    static double division(int a, int b) throws IOException {

        try {
            LOGGER.debug("Urmeaza inpartirea lui {} la {}", a, b);
            return a / b;
        } catch (ArithmeticException e) {
            throw new IOException("Ompartira la 0", e);
        } finally {
        }

    }

}
