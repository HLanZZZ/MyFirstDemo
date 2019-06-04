package com.example.demo.entity;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id",unique = true,nullable = false)
    private int ticketId;
    @Column(name = "booking_id",nullable = false)
    private int bookingId;
    @Column(name = "ticket_ref",nullable = false)
    private int ticketRef;
    @Column(name = "segment_name",nullable = false)
    private String segmentName;
    @Column(name = "passenger_ref",nullable = false)
    private int passengerRef;
    @Column(name = "segment_ref",nullable = false)
    private Integer segmentRef;
    @Column(name = "ssr_ref",nullable = false)
    private Integer ssrRef;
    @Column(name = "airline_code",nullable = false)
    private String airlineCode;
    @Column(name = "document_number",nullable = false)
    private String documentNumber;
    @Column(name = "ticket_status",nullable = false)
    private String ticketStatus;
    @Column(name = "cpn_number",nullable = false)
    private Integer cpnNumber;
    @Column(name = "status",nullable = false,length = 11)
    private int status;
    @Column(nullable = false,length = 11,name = "sbr_version")
    private int sbrVersion;
    @Column(name = "version",nullable = false,length = 11)
    private int version;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketRef() {
        return ticketRef;
    }

    public void setTicketRef(int ticketRef) {
        this.ticketRef = ticketRef;
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

    public Integer getSegmentRef() {
        return segmentRef;
    }

    public void setSegmentRef(Integer segmentRef) {
        this.segmentRef = segmentRef;
    }

    public Integer getSsrRef() {
        return ssrRef;
    }

    public void setSsrRef(Integer ssrRef) {
        this.ssrRef = ssrRef;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Integer getCpnNumber() {
        return cpnNumber;
    }

    public void setCpnNumber(Integer cpnNumber) {
        this.cpnNumber = cpnNumber;
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
