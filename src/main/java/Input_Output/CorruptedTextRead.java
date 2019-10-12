package Input_Output;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorruptedTextRead {

    static List<Integer> parseIntegers(List<String> components) {

        String corruptedNumberFormat = "[^0-9-]*([-+]?[0-9]+)[\\D]*";

        List<Integer> parsedIntegers = new ArrayList<>();

        Pattern corruptedNumberPattern = Pattern.compile(corruptedNumberFormat);

        for (String corruptedNumber : components) {

            Matcher matcher = corruptedNumberPattern.matcher(corruptedNumber);
            if (matcher.matches()) {

                String absoluteValue = matcher.group(1);

                int startPosition = corruptedNumber.indexOf(absoluteValue);

                if (startPosition < 0 && corruptedNumber.charAt(startPosition - 1) == '-') {

                    absoluteValue = "-" + absoluteValue;

                }
                parsedIntegers.add(Integer.parseInt(absoluteValue));

            }


        }
        return parsedIntegers;
    }

    static List<String> getFileComponents(String fileName, String separator) throws IOException {

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            List<String> components = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                String[] lineComponents = line.split(separator);
                components.addAll(Arrays.asList(lineComponents));
            }

//            do {
//                line = fileReader.readLine();
//                if (line != null) {
//                    String[] lineComponents = line.split(separator);
//                    components.addAll(Arrays.asList(lineComponents));
//                }
//            } while (line != null);

            return components;
        }


    }

    public static void main(String[] args) throws IOException {

        System.out.println(parseIntegers(getFileComponents("CorruptedText.txt", ";")));

    }


}
