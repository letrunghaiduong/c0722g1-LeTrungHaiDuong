package case_study.model;

import java.time.LocalDate;

public class Booking {
    int bookingCode;
    LocalDate startDay;
    LocalDate endDate;
    int customerCode;
    String serviceName;
    String serviceCode;

    public Booking(int bookingCode, LocalDate startDay, LocalDate endDate, int customerCode, String serviceName,String serviceCode) {
        bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.serviceCode = serviceCode;
    }

    public Booking() {
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        bookingCode = bookingCode;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "BookingCode=" + bookingCode +
                ", startDay='" + startDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode=" + customerCode +
                ", serviceName='" + serviceName + '\'' +
                ", serviceName='" + serviceCode + '\'' +
                '}';
    }
}

