import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_PrinterQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentInput = scanner.nextLine();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        while (!currentInput.equals("print")) {
            if (currentInput.equals("cancel")) {
                String firstTask = printerQueue.poll();

                if (firstTask == null) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + firstTask);
                }
            } else {
                printerQueue.offer(currentInput);
            }

            currentInput = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
