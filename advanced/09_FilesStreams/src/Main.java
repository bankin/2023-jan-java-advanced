import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\ser_output.ser";

        List<String> strings = Arrays.asList("Some", "Names", "In", "List");
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(strings);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException exceptionVariableName) {
            System.out.println("Sorry this was not a number!");
        }

        Path path = Paths.get("/asd");

        int readByte = System.in.read();
        while (readByte >= 0) {
            System.out.println(readByte);

            readByte = System.in.read();
        }
    }
}