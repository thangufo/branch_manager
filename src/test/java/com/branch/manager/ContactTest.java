package com.branch.manager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class ContactTest {
    private Contact contact1;
    @Before
    public void initObjects() {
        this.contact1 = new Contact();
        contact1.setName("Test contact 1");
        contact1.setMobilePhone("012345678");
        contact1.setWorkPhone("012345678");
        contact1.setAddress("Melbourne");
    }

    @Test
    public void testSetGet(){
        Assert.assertEquals("Test contact 1",contact1.getName());
        Assert.assertEquals("012345678",contact1.getMobilePhone());
    }

    @Test
    public void testToString() {
        String string = contact1.toString();
        Assert.assertNotEquals(-1,string.indexOf("Melbourne"));
        Assert.assertNotEquals(-1, string.indexOf("012345678"));
    }
}
