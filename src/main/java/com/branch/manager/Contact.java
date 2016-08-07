package com.branch.manager;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int compareTo(Contact contact) {
        return (this.getName().compareToIgnoreCase(contact.getName()));
    }

    public String toString() {
        return "Name: "+this.name
                +"\n"+"Phone: "+this.phone
                ;
    }
}
