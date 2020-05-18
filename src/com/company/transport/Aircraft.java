package com.company.transport;

public class Aircraft extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Aircraft");
    }

    public Aircraft() {
    }

    public Aircraft(String id) {
        super(id);
    }
}
