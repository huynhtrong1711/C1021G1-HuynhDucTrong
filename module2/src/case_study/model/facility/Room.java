package case_study.model.facility;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, int acreage, int cost, int numberOfPeople, String rentType, String freeService) {
        super(serviceName, acreage, cost, numberOfPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
