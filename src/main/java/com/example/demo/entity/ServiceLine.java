package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "service_line")
public class ServiceLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_line_id",nullable = false,unique = true)
    private int serviceLineId;
    @Column(name = "booking_id",nullable = false)
    private Integer bookingId;
    @Column(name = "ssr_ref",nullable = false)
    private int ssrRef;
    @Column(name = "segment_name",nullable = false)
    private String segmentName;
    @Column(name = "passenger_ref",nullable = false)
    private int passengerRef;
    @Column(name = "segment_ref",nullable = false)
    private int segmentRef;
    @Column(name = "segment_ref2",nullable = false)
    private Integer segmentRef2;
    @Column(name = "ssr_code",nullable = false)
    private String ssrCode;
    @Column(name = "seat",nullable = false)
    private String seat;
    @Column(name = "seat_characteristic",nullable = false)
    private String seatCharacteristic;
    @Column(name = "company_id",nullable = false)
    private String companyId;
    @Column(name = "quantity",nullable = false)
    private int quantity;
    @Column(name = "voluntary_cancel",nullable = false)
    private String voluntaryCancel;
    @Column(name = "free_text",nullable = false)
    private String freeText;
    @Column(name = "service_line_status",nullable = false)
    private String serviceLineStatus;
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
    @Column(length = 11,name = "cancelled_version")
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
    private Integer sbrVersion;
    @Column(nullable = false,length = 11)
    private Integer version;

    public int getServiceLineId() {
        return serviceLineId;
    }

    public void setServiceLineId(int serviceLineId) {
        this.serviceLineId = serviceLineId;
    }



    public int getSsrRef() {
        return ssrRef;
    }

    public void setSsrRef(int ssrRef) {
        this.ssrRef = ssrRef;
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



    public String getSsrCode() {
        return ssrCode;
    }

    public void setSsrCode(String ssrCode) {
        this.ssrCode = ssrCode;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getSeatCharacteristic() {
        return seatCharacteristic;
    }

    public void setSeatCharacteristic(String seatCharacteristic) {
        this.seatCharacteristic = seatCharacteristic;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVoluntaryCancel() {
        return voluntaryCancel;
    }

    public void setVoluntaryCancel(String voluntaryCancel) {
        this.voluntaryCancel = voluntaryCancel;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    public String getServiceLineStatus() {
        return serviceLineStatus;
    }

    public void setServiceLineStatus(String serviceLineStatus) {
        this.serviceLineStatus = serviceLineStatus;
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

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getSegmentRef2() {
        return segmentRef2;
    }

    public void setSegmentRef2(Integer segmentRef2) {
        this.segmentRef2 = segmentRef2;
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

    public void setSbrVersion(Integer sbrVersion) {
        this.sbrVersion = sbrVersion;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
