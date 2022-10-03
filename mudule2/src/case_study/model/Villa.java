package case_study.model;

public class Villa extends Facility{
    String roomStandard;
    double poolArea;
    int numberOfFloors;

    public Villa(String nameService, double usableArea, double rentCost, int numberOfPeople, String rentType, String roomStandard, double poolArea, int numberOfFloors) {
        super(nameService, usableArea, rentCost, numberOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
