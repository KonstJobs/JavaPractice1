/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.dao;

import account.contact.Contact;
import accountMessage.Message;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author konst
 */

@Component
public class MessageDao {

    public void storeMessage(Message message) {
    }

    public List<Message> getConversation(Contact contact1, Contact contact2) {
        return null;
    }
}
