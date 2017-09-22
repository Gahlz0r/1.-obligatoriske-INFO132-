
/**
 * A class for a person which holds two fields, the person's name and their online/offline status.
 *
 * @Ahl Vegard Nilsen
 * @1.0
 */
public class Person
{
    // field for name and for status offline/online in a boolean type
    private boolean isOnline;
    private String name;
    
    /**
     * Constructor for objects of class Person
     */
    public Person(String name)
    {
        // Prompts the user for name and sets the initial value of isOnline to false
        isOnline = false;
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    /**
     * A method for displaying the online/offline status
     */
    public boolean getOnlineStatus()
    {
       return isOnline;
    }
    
    /**
     * A method for changing online/offline status status to online
     */
    public void setOnlineStatusToOnline()
    {
        isOnline = true;
    }

    
    /**
     * Method for setting online/offline status status to offline
     */
    public void setOnlineStatusToOffline()
    {
        isOnline = false;
    }
   
     
    /**
     * Method for receiving messages. The if-test 
     */
    public void receiveMessage(Message message)
    {
       if(message.sender.getOnlineStatus() == true) {
           System.out.println("From: " + message.sender.getName() + " (online)");
       }
       else {
           System.out.println("From: " + message.sender.getName() + " (offline)");
       }
       System.out.println("To: " + name);
       System.out.println("Message: ");
       System.out.println(message.messageBody);
    }
    
    
}
