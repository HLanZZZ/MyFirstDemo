package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "form_of_payment")
public class FormOfPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "form_of_payment_id")
    private int formOfPaymentId;
    @Column(nullable = false,name = "booking_id")
    private int bookingId;
    @Column(nullable = false,name = "element_ref")
    private int elementRef;
    @Column(nullable = false,name = "segment_name")
    private String segmentName;
    @Column(nullable = false,name = "passenger_ref")
    private int passengerRef;
    @Column(nullable = false,name = "ssr_ref")
    private int ssrRef;
    @Column(nullable = false,name = "fop_code")
    private String fopCode;
    @Column(nullable = false,name = "fop_status")
    private String fopStatus;
    @Column(nullable = false,name = "free_text")
    private String freeText;
    @Column(nullable = false,name = "status")
    private int status;
    @Column(nullable = false,name = "sbr_version")
    private int sbrVersion;
    @Column(nullable = false,name = "version")
    private int version;

    public int getFormOfPaymentId() {
        return formOfPaymentId;
    }

    public void setFormOfPaymentId(int formOfPaymentId) {
        this.formOfPaymentId = formOfPaymentId;
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

    public int getSsrRef() {
        return ssrRef;
    }

    public void setSsrRef(int ssrRef) {
        this.ssrRef = ssrRef;
    }

    public String getFopCode() {
        return fopCode;
    }

    public void setFopCode(String fopCode) {
        this.fopCode = fopCode;
    }

    public String getFopStatus() {
        return fopStatus;
    }

    public void setFopStatus(String fopStatus) {
        this.fopStatus = fopStatus;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
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
