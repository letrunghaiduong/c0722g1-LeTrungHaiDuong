package case_study.model;

public class Room extends Facility{
    String freeService;

    public Room(String nameService, String serviceCode, double usableArea, double rentCost, int numberOfPeople, String rentType, String freeService) {
        super(nameService,serviceCode, usableArea, rentCost, numberOfPeople, rentType);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", nameService='" + nameService + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType='" + rentType + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s", nameService,serviceCode, usableArea, rentCost,numberOfPeople, rentType, freeService);
    }
}
