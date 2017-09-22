
/**
 * Write a description of class Message here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Message
{
    // Field for storing the message body and another field of another class (Person) storing the sender
    public String messageBody;
    public Person sender;

    /**
     * The constructor 
     */
    public Message(Person sender, String messageBody)
    {
        this.sender = sender;
        this.messageBody = messageBody;
    }

    /*
    public String getMessageBody("dette er min beskjed", String)
    {
    return messageBody;
    }

    */

    public void getSender()
    {
       sender = sender;
    }
}

