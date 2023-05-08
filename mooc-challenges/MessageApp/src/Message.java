import java.util.Objects;

public class Message {
    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return this.getContent() + " by " + this.getSender();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
            // If two objects have the same reference
        }

        if (obj == null) {
            return false;
            // If the Object passed as a parameter is null
            // it means they are not equal
        }

        if (getClass() != obj.getClass()) {
            return false;
        }


        final Message other = (Message) obj;
        if(!Objects.equals(this.sender, other.sender)) {
            return false;
        }

        if(!Objects.equals(this.content, other.content)) {
            return false;
        }
        return false;

    }
}
