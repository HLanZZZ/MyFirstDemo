package com.example.demo.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;
    @Column(name = "booking_ref",nullable = false)
    private String bookingRef;
    @Column(name = "booking_date",nullable = false)
    private Date bookingDate;
    @Column(nullable = false)
    private String pos;
    @Column(name = "creating_office",nullable = false)
    private String creatingOffice;
    @Column(name = "sbr_version",nullable = false)
    private int sbrVersion;
    @Column(nullable = false)
    private int version;


    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getCreatingOffice() {
        return creatingOffice;
    }

    public void setCreatingOffice(String creatingOffice) {
        this.creatingOffice = creatingOffice;
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
