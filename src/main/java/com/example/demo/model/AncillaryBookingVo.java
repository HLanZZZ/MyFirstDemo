package com.example.demo.model;


import java.util.ArrayList;
import java.util.List;

public class AncillaryBookingVo {

    private String rloc;
    private List<PassengerVo> passenger = new ArrayList<PassengerVo>();
    private List<SegmentVo>  segment = new ArrayList<SegmentVo>();
    private List<AncillaryProducts> ancillaryProducts = new ArrayList<AncillaryProducts>();


    public String getRloc() {
        return rloc;
    }

    public void setRloc(String rloc) {
        this.rloc = rloc;
    }

    public List<PassengerVo> getPassenger() {
        return passenger;
    }

    public void setPassenger(List<PassengerVo> passenger) {
        this.passenger = passenger;
    }

    public List<SegmentVo> getSegment() {
        return segment;
    }

    public void setSegment(List<SegmentVo> segment) {
        this.segment = segment;
    }

    public List<AncillaryProducts> getAncillaryProducts() {
        return ancillaryProducts;
    }

    public void setAncillaryProducts(List<AncillaryProducts> ancillaryProducts) {
        this.ancillaryProducts = ancillaryProducts;
    }

//    public AncillaryBookingVo(String rloc, List<PassengerVo> passenger, List<SegmentVo> segment, List<AncillaryProducts> ancillaryProducts) {
//        this.rloc = rloc;
//        this.passenger = passenger;
//        this.segment = segment;
//        this.ancillaryProducts = ancillaryProducts;
//    }

//
//
}
