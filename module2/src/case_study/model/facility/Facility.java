package case_study.model.facility;

public abstract class Facility {
    private String idFacility;
    private String ServiceName;
    private int acreage;
    private int cost;
    private int numberOfPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(String idFacility, String serviceName, int acreage, int cost, int numberOfPeople, String rentType) {
        this.idFacility = idFacility;
        this.ServiceName = serviceName;
        this.acreage = acreage;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentType = rentType;
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

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    @Override
    public String toString() {
        return "idService=" + idFacility + '\'' +
                ", serviceName='" + ServiceName + '\'' +
                ", acreage=" + acreage +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentType=" + rentType + ", ";
    }
}
