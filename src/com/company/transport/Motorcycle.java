package com.company.transport;

public class Motorcycle extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Motorcycle");
    }

    public Motorcycle() {
    }

    public Motorcycle(String id) {
        super(id);
    }
}
