package case_study.model.facility;

public abstract class Facility {
    private String idServiceName;
    private int acreage;
    private int cost;
    private int numberOfPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceName, int acreage, int cost, int numberOfPeople, String rentType) {
        this.idServiceName = serviceName;
        this.acreage = acreage;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentType = rentType;
    }

    public String getIdServiceName() {
        return idServiceName;
    }

    public void setIdServiceName(String idServiceName) {
        this.idServiceName = idServiceName;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

    @Override
    public String toString() {
        return "serviceName='" + idServiceName + '\'' +
                ", acreage=" + acreage +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType=" + rentType + ", ";
    }
}
