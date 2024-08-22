package com.wolters.Anno_DIbyAutoWiredBasic.pojos;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String name;

//    @Autowired
    private Address address;

    public Employee() {
    }

    @Autowired
    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
        System.out.println("Inside Constructor");
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

//    @Autowired
    public void setAddress(Address address) {
        System.out.println("Inside Setter");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}