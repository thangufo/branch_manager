package com.branch.manager;

import java.util.ArrayList;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    /**
     *
     * @return
     */
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    /**
     *
     * @param contacts
     */
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * Add a contact to list
     *
     * @param contact
     */
    public void addContact(Contact contact) {
        if (contact != null) {
            this.contacts.add(contact);
        }
    }

    /**
     * Remove a contact
     *
     * @param contact
     * @return
     */
    public boolean removeContact(Contact contact) {
        int index = this.contacts.indexOf(contact);
        if (index != -1) {
            this.contacts.remove(contact);
            return true;
        } else {
            return false; //can't find that item
        }
    }

    /**
     * Convert a address book object to string
     *
     * @return
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Contact contact : contacts) {
            result.append(contact.toString() + "\n");
        }

        return result.toString();
    }
}
