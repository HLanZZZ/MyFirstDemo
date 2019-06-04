package com.example.demo.entity;



import javax.persistence.*;

@Entity
@Table(name ="passenger")
public class Passenger extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id",unique = true,nullable = false)
    private int passengerId ;
    @Column(name = "booking_id",nullable = false)
    private int bookingId;
    @Column(name = "passenger_ref",nullable = false)
    private int passenger_ref;
    @Column(name = "family_name",nullable = false)
    private String familyName;
    @Column(name = "given_name",nullable = false)
    private String givenName;
    @Column(nullable = false,name = "status")
    private int status;
    @Column(name = "sbr_version",nullable = false)
    private int sbrVersion;
    @Column(nullable = false,name = "version")
    private int version;

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPassenger_ref() {
        return passenger_ref;
    }

    public void setPassenger_ref(int passenger_ref) {
        this.passenger_ref = passenger_ref;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
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
