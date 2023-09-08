
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class MessagingService {
    
    private ArrayList<Message> arrayMessages;
    
    public MessagingService(){
        this.arrayMessages = new ArrayList<>();
    }
    
    public void add(Message message){
        String aux = message.getContent();
        
        if( aux.length() <= 280 ){
            this.arrayMessages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.arrayMessages;
    }
}
