package com.company.transport;

public class Automobile extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Automobile");
    }

    public Automobile() {
    }

    public Automobile(String id) {
        super(id);
    }
}
