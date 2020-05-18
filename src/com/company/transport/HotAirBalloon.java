package com.company.transport;

public class HotAirBalloon extends AirTransport{
    @Override
    public void drivingMethod() {
        System.out.println("ride by HotAirBalloon");
    }

    public HotAirBalloon() {
    }

    public HotAirBalloon(String id) {
        super(id);
    }
}
