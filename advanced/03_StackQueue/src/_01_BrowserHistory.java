import java.util.*;

public class _01_BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> history =  new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")) {
            if (currentInput.equals("back")) {
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");

                    currentInput = scanner.nextLine();

                    continue;
                }

                history.pop();
            } else {
                history.push(currentInput);
            }

            System.out.println(history.peek());

            currentInput = scanner.nextLine();
        }
    }
}
