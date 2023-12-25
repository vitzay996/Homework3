package services;

import models.Contact;

import java.util.ArrayList;

public interface ContactsService {
    ArrayList<Contact> getSearchContact(String enteredStr);

    ArrayList<Contact> getAll();

    void remove(int index);

    void add(Contact contact);
}
