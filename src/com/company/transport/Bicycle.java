package com.company.transport;

public class Bicycle extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Bicycle");
    }

    public Bicycle() {
    }

    public Bicycle(String id) {
        super(id);
    }
}
