package com.company.transport;

public class Submarine extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Submarine");
    }

    public Submarine() {
    }

    public Submarine(String id) {
        super(id);
    }
}
