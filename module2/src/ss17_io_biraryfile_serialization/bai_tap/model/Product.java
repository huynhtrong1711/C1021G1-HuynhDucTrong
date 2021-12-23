package ss17_io_biraryfile_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable{
    public int idProduct;
    public String nameProduct;
    public String khanOfProduct;
    public int priceProduct;
    public String description;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String khanOfProduct, int priceProduct, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.khanOfProduct = khanOfProduct;
        this.priceProduct = priceProduct;
        this.description = description;
    }


    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getKhanOfProduct() {
        return khanOfProduct;
    }

    public void setKhanOfProduct(String khanOfProduct) {
        this.khanOfProduct = khanOfProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", khanOfProduct='" + khanOfProduct + '\'' +
                ", priceProduct=" + priceProduct +
                ", description='" + description + '\'' +
                '}';
    }

}
