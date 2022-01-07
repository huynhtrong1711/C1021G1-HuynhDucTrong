package thi.model;

public class Import extends Product{
    private int priceImport;
    private String provinceImport;
    private int tax;

    public Import() {
    }

    public Import(String codeProduct, String name, int price, int quantum, String producer, int priceImport, String provinceImport, int tax) {
        super(codeProduct, name, price, quantum, producer);
        this.priceImport = priceImport;
        this.provinceImport = provinceImport;
        this.tax = tax;
    }

    public Import(int parseInt, String s, String s1, int parseInt1, int parseInt2, String s2, int parseInt3, String s3, int parseInt4) {
    }

    public int getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(int priceImport) {
        this.priceImport = priceImport;
    }

    public String getProvinceImport() {
        return provinceImport;
    }

    public void setProvinceImport(String provinceImport) {
        this.provinceImport = provinceImport;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" + super.toString() +
                ", priceImport=" + priceImport +
                ", provinceImport='" + provinceImport + '\'' +
                ", tax=" + tax +
                '}';
    }
}
