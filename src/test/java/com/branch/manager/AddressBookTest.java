package com.branch.manager;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by thangnguyen on 8/1/16.
 */
@Test
public class AddressBookTest {
    private AddressBook addressBook;
    private Contact contact1;
    private Contact contact2;
    private Contact contact3;

    @BeforeMethod
    public void initObjects() {
        this.addressBook = new AddressBook();

        this.contact1 = new Contact("Thang Nguyen","123456789");
        this.contact2 = new Contact("John","987654321");
        this.contact3 = new Contact("Andrew","567891234");
    }

    @Test
    public void testAddContact() {
        //test adding null contact
        this.addressBook.addContact(null);
        assertEquals(this.addressBook.getContacts().size(),0);

        this.addressBook.addContact(this.contact1);
        assertEquals(this.addressBook.getContacts().size(),1);
    }

    @Test
    public void testRemoveContact() {
        //add contact1 and then try to remove contact2
        this.addressBook.addContact(this.contact1);
        this.addressBook.removeContact(this.contact2);
        assertEquals(this.addressBook.getContacts().size(),1);

        //now remove contact1
        this.addressBook.removeContact(this.contact1);
        assertEquals(this.addressBook.getContacts().size(),0);
    }

    @Test
    public void testGetSortedContacts() {
        this.addressBook.addContact(contact1);
        this.addressBook.addContact(contact2);
        this.addressBook.addContact(contact3);

        ArrayList<Contact> sortedContacts = this.addressBook.getSortedContacts();
        assertEquals(sortedContacts.size(), 3);
        assertEquals(sortedContacts.get(0).getName(),"Andrew");
        assertEquals(sortedContacts.get(1).getName(), "John");
        assertEquals(sortedContacts.get(2).getName(),"Thang Nguyen");
    }

    @Test
    public void testGetUniqueContacts() {
        this.addressBook.addContact(contact1);
        this.addressBook.addContact(contact1);
        AddressBook otherBook = new AddressBook();
        otherBook.addContact(contact2);
        otherBook.addContact(contact2);

        ArrayList<Contact> uniqueContacts = this.addressBook.getUniqueContacts(otherBook);
        assertEquals(uniqueContacts.size(),2);
    }

    @Test
    public void testPrintContactList() {
        this.addressBook.addContact(contact1);
        this.addressBook.addContact(contact2);
        this.addressBook.addContact(contact3);

        String result = this.addressBook.printContactList(this.addressBook.getContacts());
        assertNotEquals(result.indexOf("Thang Nguyen"),-1);
        assertNotEquals(result.indexOf("Andrew"),-1);
        assertNotEquals(result.indexOf("John"),-1);
    }
}
