package Input_Output;

import java.io.IOException;

import static java.lang.System.exit;

public class InputApp {

    public static void main(String[] args)  {

        try {
        int a;
        do{

            a = System.in.read();


            System.out.println((char) a);
            System.out.println(a);
        }while (a != 32);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Something's wrong");
            exit(-1);
        }


    }



}
