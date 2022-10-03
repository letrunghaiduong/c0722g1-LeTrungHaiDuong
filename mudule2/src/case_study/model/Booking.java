package case_study.model;

public class Booking {
    int BookingCode;
    String startDay;
    String endDate;
    int customerCode;
    String serviceName;
    String typeOfService;

    public Booking(int bookingCode, String startDay, String endDate, int customerCode, String serviceName, String typeOfService) {
        BookingCode = bookingCode;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public Booking() {
    }

    public int getBookingCode() {
        return BookingCode;
    }

    public void setBookingCode(int bookingCode) {
        BookingCode = bookingCode;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "BookingCode=" + BookingCode +
                ", startDay='" + startDay + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode=" + customerCode +
                ", serviceName='" + serviceName + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}

