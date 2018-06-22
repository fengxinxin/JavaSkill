package com.iolo.javaskill.NPE;

/**
 * Created by FengXinXin on 2018/6/22.
 */
public class User {
    public String name;
    public Address address;

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
