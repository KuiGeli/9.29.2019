package Input_Output;

import shapes.Circle;

import java.io.*;

public class SerializeDeserializeApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Circle circle = new Circle(15);
        serialize(circle, "serialized.txt");
        System.out.println(deserialize("serialized.txt"));
    }

    static void serialize(Serializable toSerialize, String desFile) throws IOException {
        try(OutputStream fileOutputStream = new FileOutputStream(desFile)) {
            ObjectOutputStream serializer = new ObjectOutputStream(fileOutputStream);
            serializer.writeObject(toSerialize);
        }
    }

    static Circle deserialize (String sourceFile) throws IOException, ClassNotFoundException {
        try(InputStream fileInputStream = new FileInputStream(sourceFile)) {
           ObjectInputStream deserializer = new ObjectInputStream(fileInputStream);
           Circle circle = (Circle) deserializer.readObject();
           return circle;


        }
    }
}
