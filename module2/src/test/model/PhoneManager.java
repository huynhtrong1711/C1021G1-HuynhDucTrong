package test.model;

public abstract class PhoneManager {
    static int idPhone;
    private String namePhone;
    private int price;
    private int quantily;
    private String producer;

    public PhoneManager() {
    }

    public PhoneManager(String namePhone, int price, int quantily, String producer) {
        this.idPhone = idPhone++;
        this.namePhone = namePhone;
        this.price = price;
        this.quantily = quantily;
        this.producer = producer;
    }

    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "PhoneManager{" +
                "idPhone=" + idPhone +
                ", namePhone='" + namePhone + '\'' +
                ", price=" + price +
                ", quantily=" + quantily +
                ", producer='" + producer + '\'' +
                '}';
    }
}
