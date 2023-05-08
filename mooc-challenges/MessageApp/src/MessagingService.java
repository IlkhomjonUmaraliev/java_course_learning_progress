import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if(message.getSender().length() <= 280 || message.getContent().length() <= 280) {
            if(!messages.contains(message)) {
                messages.add(new Message(message.getSender(), message.getContent()));
            }
        } else {
            System.out.println("Too many characters");
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public int getSize() {
        return messages.size();
    }
}
