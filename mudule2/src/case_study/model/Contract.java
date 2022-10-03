package case_study.model;

public class Contract {
    int contractNumber;
    int bookingNumber;
    double deposits;
    double payments;
    int customerCode;

    public Contract(int contractNumber, int bookingNumber, double deposits, double payments, int customerCode) {
        this.contractNumber = contractNumber;
        this.bookingNumber = bookingNumber;
        this.deposits = deposits;
        this.payments = payments;
        this.customerCode = customerCode;
    }

    public Contract() {
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingNumber=" + bookingNumber +
                ", deposits=" + deposits +
                ", payments=" + payments +
                ", customerCode=" + customerCode +
                '}';
    }
}
