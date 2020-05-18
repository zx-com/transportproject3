package com.company.transport;

public class Hovercraft extends MaritimeMeansOfTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Hovercraft");
    }

    public Hovercraft() {
    }

    public Hovercraft(String id) {
        super(id);
    }
}
