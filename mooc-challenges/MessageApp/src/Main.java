import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Message laziza = new Message("Laziza", "I have always loved you but I was dumb enough to admit it");
        Message mokhinur = new Message("Mokhinur", "You are my best friend");
        Message farangiz = new Message("Laziza", "I have always loved you but I was dumb enough to admit it");

        MessagingService messagingService = new MessagingService();
        messagingService.add(laziza);
        messagingService.add(mokhinur);
        messagingService.add(farangiz);
        System.out.println(messagingService.getSize());
    }
}