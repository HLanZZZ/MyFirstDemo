package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "pd_info")
public class PdInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pd_info_id")
    private int pdInfoId;
    @Column(name = "booking_id",nullable = false)
    private int bookingId;
    @Column(name ="element_ref",nullable = false)
    private int elementRef;
    @Column(name = "segment_name",nullable = false)
    private String segmentName;
    @Column(name = "passenger_ref",nullable = false)
    private int passengerRef;
    @Column(name = "segment_ref",nullable = false)
    private int segmentRef;
    @Column(name = "seat",nullable = false)
    private String seat;
    @Column(name = "cabin",nullable = false)
    private String cabin;
    @Column(name = "status",nullable = false)
    private int status;
    @Column(name = "sbr_version",nullable = false)
    private int sbrVersion;
    @Column(name = "version",nullable = false)
    private int version;

    public int getPdInfoId() {
        return pdInfoId;
    }

    public void setPdInfoId(int pdInfoId) {
        this.pdInfoId = pdInfoId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getElementRef() {
        return elementRef;
    }

    public void setElementRef(int elementRef) {
        this.elementRef = elementRef;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public int getPassengerRef() {
        return passengerRef;
    }

    public void setPassengerRef(int passengerRef) {
        this.passengerRef = passengerRef;
    }

    public int getSegmentRef() {
        return segmentRef;
    }

    public void setSegmentRef(int segmentRef) {
        this.segmentRef = segmentRef;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSbrVersion() {
        return sbrVersion;
    }

    public void setSbrVersion(int sbrVersion) {
        this.sbrVersion = sbrVersion;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
