package com.example.demo.entity;

import java.util.List;

public class AncillaryBooking {

    private List<Passenger>  passengerList;
    private List<Segment>  segmentList;

    public List<Passenger> getPassengerList() {

        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public List<Segment> getSegmentList() {
        return segmentList;
    }

    public void setSegmentList(List<Segment> segmentList) {
        this.segmentList = segmentList;
    }

}
