package case_study.model;

public class Room extends Facility{
    String freeService;

    public Room(String nameService, double usableArea, double rentCost, int numberOfPeople, String rentType, String freeService) {
        super(nameService, usableArea, rentCost, numberOfPeople, rentType);
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
                "freeService='" + freeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentCost=" + rentCost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
