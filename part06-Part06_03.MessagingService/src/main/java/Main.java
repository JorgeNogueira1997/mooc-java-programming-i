
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        String sender = "Jorge";
        String content = "olaola123";
        
        Message x = new Message(sender, content);

        Message z = new Message("Horld","999");
        
        System.out.println(x.getSender());
        System.out.println(x.getContent());
        x.toString();
        
        MessagingService y = new MessagingService();
        
        y.add(z);
        System.out.println(y.getMessages());

    }
}
