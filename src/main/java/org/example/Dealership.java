package org.example;

import java.util.ArrayList;
import java.util.List;

public class Dealership {



    private String name;
    private String address;
    private String phone;
    private List<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }



}
