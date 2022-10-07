package case_study.model;

public class House extends Facility{
    String roomStandard;
    int numberOfFloors;

    public House(String nameService, String serviceCode, double usableArea, double rentCost, int numberOfPeople, String rentType, String roomStandard, int numberOfFloors) {
        super(nameService, serviceCode, usableArea, rentCost, numberOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                ", serviceCode='" + serviceCode + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType='" + rentType + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", nameService='" + nameService + '\'' +
                '}';
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s", nameService,serviceCode, usableArea, rentCost, numberOfPeople,rentType, roomStandard, numberOfFloors);
    }
}
