package case_study.model.facility;


public class Villa extends House {
    private int poolArea;

    public Villa() {
    }

    public Villa(String serviceName, int acreage, int cost, int numberOfPeople, String rentType, String quality, int floor, int poolArea) {
        super(serviceName, acreage, cost, numberOfPeople, rentType, quality, floor);
        this.poolArea = poolArea;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() + '\'' +
                "poolArea=" + poolArea +
                '}';
    }
}
