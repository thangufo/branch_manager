package com.branch.manager;

/**
 * Created by thangnguyen on 8/1/16.
 */
public class Contact {
    private String name;
    private String workPhone;
    private String mobilePhone;
    private String address;

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     *
     * @param workPhone
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     *
     * @return
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     *
     * @param mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Name: "+this.name
                +"\n"+"Work phone: "+this.workPhone
                +"\n"+"Mobile phone: "+this.mobilePhone
                +"\n"+"Address: "+this.address
                ;
    }
}
