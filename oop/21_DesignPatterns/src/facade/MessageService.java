package facade;

public class MessageService {
    private static String defaultSender = "...";

    public MessageService() {
        this.client = ClientBuilder().id().defaultUser().build();
    }

    public void sendMessage(String msg) {
        MessageSendRequest request = MessageSendRequestBuilder
                .content(msg)
                .sender(defaultSender)
                .build();

        this.client.send(request);
    }
}
