package case_study.model;

public abstract class Facility {
    String nameService;
    double usableArea;
    double rentCost;
    int numberOfPeople;
    String rentType;

    public Facility(String nameService, double usableArea, double rentCost, int numberOfPeople, String rentType) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.rentType = rentType;
    }

    public Facility() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }
}
