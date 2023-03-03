import _01_Car.Seat;
import _02_CarExtended.CarImpl;
import _06_Ferrari.Ferrari;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        new CarImpl("asd", "asd", 4, "asd");

//        System.out.println("Hello world!");

        List<String> list = new ArrayList<>();
        list.add("asad");
        list.add("asad2");
        list.add("asad3");

        Ferrari car = new Ferrari("Driver");
        Seat seat = new Seat("mode", "color", 13, "country");

        FileOutputStream fileOutputStream
                = new FileOutputStream("list.ser");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(seat);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("list.ser");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
//        List<String> p2 = (List<String>) objectInputStream.readObject();
        Seat p2 = (Seat) objectInputStream.readObject();
        objectInputStream.close();
    }
}