import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class _04_ExtractIntegers {

    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\04_output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));
//        PrintStream writer = System.out;

        while (reader.hasNext()) {
            if (reader.hasNextInt()) {
                writer.println(reader.nextInt());
            }

            reader.next();
        }
    }
}
