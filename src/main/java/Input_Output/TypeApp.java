package Input_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TypeApp {


    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        typeFile(fileName);

    }

    static void  typeFile (String fileName) throws IOException {

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }

        }

//        try (Reader fileReader = new FileReader(fileName)){
//            int ch;
//            while ((ch = fileReader.read()) != -1) {
//
//                System.out.print((char)ch);
//
//            }
//        }
    }


}
