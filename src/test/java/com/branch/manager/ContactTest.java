package com.branch.manager;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by thangnguyen on 8/1/16.
 */
@Test
public class ContactTest {
    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][] {{"Thang Nguyen", "123456789"}, {"Andrew", "987654321"}};
    }

    @Test(dataProvider = "testData")
    public void testSetGet(String name, String phone){
        Contact contact1 = new Contact(name,phone);
        assertEquals(contact1.getName(),name);
        assertEquals(contact1.getPhone(),phone);
    }

    @Test(dataProvider = "testData")
    public void testToString(String name, String phone) {
        Contact contact1 = new Contact(name,phone);

        String string = contact1.toString();
        assertNotEquals(string.indexOf(name),-1);
        assertNotEquals(string.indexOf(phone),-1);
    }
}
