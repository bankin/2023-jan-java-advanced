import java.io.File;

public class _07_ListFiles {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\User\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(folderPath);

        File[] nestedFiles = file.listFiles();

        for (File nestedFile : nestedFiles) {
            if (nestedFile.isFile()) {
                System.out.printf("%s: [%d]%n", nestedFile.getName(), nestedFile.length());
            }
        }
    }
}
