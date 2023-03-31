package facade;

public class Main {

    public static void main(String[] args) {
        MessageService service = new MessageService();
        service.sendMessage("Hello!");
    }
}
