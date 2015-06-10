/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import account.Contact;
import account.Message;
import dao.ContactDao;
import dao.HobbyDao;
import dao.MessageDao;
import dao.PlaceDao;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 *
 * @author konst
 */
public class JavaContactService {

    ContactDao contactDao;
    HobbyDao hobbyDao;
    PlaceDao placeDao;
    MessageDao messageDao;

    public void createContact(String firstName, String lastName, LocalDate birthDay) {
    }

    public void addHobby(String title, String description) {
    }

    public void addPlace(String title, String description, double longitude, double latitude) {
    }

    public void addFriendShip(Contact contact1, Contact contact2) {
    }

    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }

    public List<Message> getConversation(Contact contact1, Contact contact2) {
        return null;
    }

}
