package thi.model;

public abstract class Product {
    private int id = 0;
    private String codeProduct;
    private String name;
    private int price;
    private int quantum;
    private String producer;

    public Product() {
    }

    public Product(String codeProduct, String name, int price, int quantum, String producer) {
        this.id++;
        this.codeProduct = codeProduct;
        this.name = name;
        this.price = price;
        this.quantum = quantum;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", codeProduct='" + codeProduct + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantum=" + quantum +
                ", producer='" + producer;
    }
}
