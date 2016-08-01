package com.branch.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.util.stream.Collectors.toList;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class User {
    private String name;
    private ArrayList<AddressBook> addressBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public ArrayList<AddressBook> getAddressBooks() {
        return addressBooks;
    }

    /**
     *
     * @param addressBooks
     */
    public void setAddressBooks(ArrayList<AddressBook> addressBooks) {
        this.addressBooks = addressBooks;
    }

    /**
     * Add an entry to the AddressBook list
     *
     * @param addressBook
     */
    public void addAddressBook(AddressBook addressBook) {
        if (addressBook != null) {
            this.addressBooks.add(addressBook);
        }
    }

    /**
     * Return true if found and remove
     * Otherwise return false
     *
     * @param addressBook
     * @return
     */
    public boolean removeAddressBook(AddressBook addressBook) {
        int index = this.addressBooks.indexOf(addressBook);
        if (index != -1) {
            this.addressBooks.remove(addressBook);
            return true;
        } else {
            return false; //can't find that item
        }
    }

    /**
     * Print all contacts to string
     *
     * @return
     */
    public String printAllContacts() {
        Set<Contact> contacts = new HashSet<>();
        for (AddressBook addressBook : this.addressBooks) {
            for (Contact contact : addressBook.getContacts()) {
                contacts.add(contact);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Contact contact : contacts) {
            result.append(contact.toString() + "\n");
        }

        return result.toString();
    }
}
