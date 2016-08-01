package com.branch.manager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class AddressBookTest {
    private AddressBook addressBook;
    private Contact contact1;
    private Contact contact2;

    @Before
    public void initObjects() {
        this.addressBook = new AddressBook();

        this.contact1 = new Contact();
        this.contact1.setName("Test contact 1");
        this.contact1.setMobilePhone("012345678");
        this.contact1.setWorkPhone("012345678");
        this.contact1.setAddress("Melbourne");

        this.contact2 = new Contact();
        this.contact2.setName("Test contact 2");
        this.contact2.setMobilePhone("87654321");
        this.contact2.setWorkPhone("87654321");
        this.contact2.setAddress("Sydney");
    }

    @Test
    public void testAddContact() {
        //test adding null contact
        this.addressBook.addContact(null);
        Assert.assertEquals(0, this.addressBook.getContacts().size());

        this.addressBook.addContact(this.contact1);
        Assert.assertEquals(1, this.addressBook.getContacts().size());
    }

    @Test
    public void testRemoveContact() {
        //add contact1 and then try to remove contact2
        this.addressBook.addContact(this.contact1);
        this.addressBook.removeContact(this.contact2);
        Assert.assertEquals(1, this.addressBook.getContacts().size());

        //now remove contact1
        this.addressBook.removeContact(this.contact1);
        Assert.assertEquals(0, this.addressBook.getContacts().size());
    }

    @Test
    public void testToString() {
        this.addressBook.addContact(this.contact1);
        this.addressBook.addContact(this.contact2);

        String string = this.addressBook.toString();
        Assert.assertNotEquals(-1, string.indexOf("Test contact 1"));
        Assert.assertNotEquals(-1, string.indexOf("Test contact 2"));
        Assert.assertNotEquals(-1, string.indexOf("012345678"));
        Assert.assertNotEquals(-1, string.indexOf("87654321"));
    }
}
