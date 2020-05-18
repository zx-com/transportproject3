package com.company.transport;

public class Airship extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by Airship");
    }

    public Airship() {
    }

    public Airship(String id) {
        super(id);
    }
}
