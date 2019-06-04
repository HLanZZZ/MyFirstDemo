package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "segment")
public class Segment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "segment_id",nullable = false,unique = true,length = 11)
    private int segmentId;
    @Column(name = "booking_id",nullable = false,length = 11)
    private int bookingId;
    @Column(name = "segment_ref",nullable = false,length = 11)
    private int segmentRef;
    @Column(nullable = false,length = 3)
    private String origin;
    @Column(nullable = false,length = 3)
    private String destination;
    @Column(nullable = false,name = "marketing_carrier",length = 2)
    private String marketingCarrier;
    @Column(nullable = false,length = 4)
    private String flight;
    @Column(nullable = false)
    private Date departureDate;
    @Column(nullable = false,name = "class",length = 1)
    private String classzz;
    @Column(nullable = false,length = 1)
    private String cabin;
    @Column(nullable = false,length = 2,name = "segment_status")
    private String segmentStatus;
    @Column(nullable = false,length = 11)
    private int status;
    @Column(nullable = false,name = "created_office",length = 10)
    private String createdOffice;
    @Column(nullable = false,name = "created_version",length = 11)
    private Integer createdVersion;
    @Column(nullable = false,name = "created_rf",length = 50)
    private String createdRf;
    @Column(nullable = false,length = 10,name = "cancelled_office")
    private String cancelledOffice;
    @Column(nullable = false,length = 11,name = "cancelled_version")
    private Integer cancelledVersion;
    @Column(nullable = false,length = 50,name = "cancelled_rf")
    private String cancelledRf;
    @Column(nullable = false,length = 10,name = "un_status_office")
    private String unStatusOffice;
    @Column(nullable = false,length = 11,name = "un_status_version")
    private Integer unStatusVersion;
    @Column(nullable = false,length = 50,name ="un_status_rf")
    private String unStatusRf;
    @Column(nullable = false,length = 11,name = "sbr_version")
    private int sbrVersion;
    @Column(nullable = false,length = 11)
    private int version;

    public int getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(int segmentId) {
        this.segmentId = segmentId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getSegmentRef() {
        return segmentRef;
    }

    public void setSegmentRef(int segmentRef) {
        this.segmentRef = segmentRef;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    public void setMarketingCarrier(String marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getClasszz() {
        return classzz;
    }

    public void setClasszz(String classzz) {
        this.classzz = classzz;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getSegmentStatus() {
        return segmentStatus;
    }

    public void setSegmentStatus(String segmentStatus) {
        this.segmentStatus = segmentStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreatedOffice() {
        return createdOffice;
    }

    public void setCreatedOffice(String createdOffice) {
        this.createdOffice = createdOffice;
    }

    public Integer getCreatedVersion() {
        return createdVersion;
    }

    public void setCreatedVersion(Integer createdVersion) {
        this.createdVersion = createdVersion;
    }

    public Integer getCancelledVersion() {
        return cancelledVersion;
    }

    public void setCancelledVersion(Integer cancelledVersion) {
        this.cancelledVersion = cancelledVersion;
    }

    public Integer getUnStatusVersion() {
        return unStatusVersion;
    }

    public void setUnStatusVersion(Integer unStatusVersion) {
        this.unStatusVersion = unStatusVersion;
    }

    public String getCreatedRf() {
        return createdRf;
    }

    public void setCreatedRf(String createdRf) {
        this.createdRf = createdRf;
    }

    public String getCancelledOffice() {
        return cancelledOffice;
    }

    public void setCancelledOffice(String cancelledOffice) {
        this.cancelledOffice = cancelledOffice;
    }



    public String getCancelledRf() {
        return cancelledRf;
    }

    public void setCancelledRf(String cancelledRf) {
        this.cancelledRf = cancelledRf;
    }

    public String getUnStatusOffice() {
        return unStatusOffice;
    }

    public void setUnStatusOffice(String unStatusOffice) {
        this.unStatusOffice = unStatusOffice;
    }



    public String getUnStatusRf() {
        return unStatusRf;
    }

    public void setUnStatusRf(String unStatusRf) {
        this.unStatusRf = unStatusRf;
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
