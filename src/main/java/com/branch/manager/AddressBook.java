package com.branch.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
     * Print all contacts ordered by name alphabetically
     *
     * @return
     */
    public ArrayList<Contact> getSortedContacts() {
        //copy the current contact list for sorting purposes
        ArrayList<Contact> contacts = new ArrayList<>(this.contacts);
        Collections.sort(contacts);
        return contacts;
    }

    /**
     *
     * @param otherBook
     * @return
     */
    public ArrayList<Contact> getUniqueContacts(AddressBook otherBook) {
        Set<Contact> set = new HashSet<>();
        set.addAll(this.contacts);
        set.addAll(otherBook.getContacts());

        return new ArrayList<>(set);
    }

    /**
     * Convert a list of contacts to string
     *
     * @param contacts
     * @return
     */
    public String printContactList(ArrayList<Contact> contacts) {
        StringBuilder result = new StringBuilder();
        for (Contact contact : contacts) {
            result.append(contact.toString() + "\n");
        }

        return result.toString();
    }
}
