package com.branch.manager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class UserTest {
    private AddressBook addressBook1;
    private AddressBook addressBook2;
    private Contact contact1;
    private Contact contact2;
    private User branchManager;

    @Before
    public void initObjects() {
        this.addressBook1 = new AddressBook();
        this.addressBook2 = new AddressBook();
        this.branchManager = new User("Manager");

        this.contact1 = new Contact();
        this.contact1.setName("Test contact 1");
        this.contact1.setMobilePhone("012345678");
        this.contact1.setWorkPhone("012345678");
        this.contact1.setAddress("Melbourne");
        this.addressBook1.addContact(this.contact1);

        this.contact2 = new Contact();
        this.contact2.setName("Test contact 2");
        this.contact2.setMobilePhone("87654321");
        this.contact2.setWorkPhone("87654321");
        this.contact2.setAddress("Sydney");
        this.addressBook2.addContact(this.contact2);
    }

    @Test
    public void testAddAddressBook() {
        //test adding null
        this.branchManager.addAddressBook(null);
        Assert.assertEquals(0, this.branchManager.getAddressBooks().size());

        this.branchManager.addAddressBook(this.addressBook1);
        Assert.assertEquals(1, this.branchManager.getAddressBooks().size());
    }

    @Test
    public void testPrintAllContacts() {
        this.branchManager.addAddressBook(this.addressBook1);
        this.branchManager.addAddressBook(this.addressBook2);

        String string = this.branchManager.printAllContacts();
        Assert.assertNotEquals(-1, string.indexOf("Test contact 1"));
        Assert.assertNotEquals(-1, string.indexOf("Test contact 2"));
        Assert.assertNotEquals(-1, string.indexOf("012345678"));
        Assert.assertNotEquals(-1, string.indexOf("87654321"));
    }
}
