package case_study.model.facility;

public class House extends Facility{
    private String quality;
    private int floor;

    public House() {
    }

    public House(String idFacility,String serviceName, int acreage, int cost, int numberOfPeople, String rentType, String quality, int floor) {
        super(idFacility,serviceName, acreage, cost, numberOfPeople, rentType);
        this.quality = quality;
        this.floor = floor;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() + '\'' +
                "quality='" + quality + '\'' +
                ", floor=" + floor +
                '}';
    }
}
