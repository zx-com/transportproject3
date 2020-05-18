package com.company.transport;

public class Train extends LandTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Train");
    }

    public Train() {
    }

    public Train(String id) {
        super(id);
    }
}
