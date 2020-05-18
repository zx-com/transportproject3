package com.company.transport;

public class Ship extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Ship");
    }

    public Ship() {
    }

    public Ship(String id) {
        super(id);
    }
}
