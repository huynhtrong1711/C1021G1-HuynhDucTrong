package thi.model;

public class Export extends Product{
    private int priceExport;
    private String nationImport;

    public Export() {
    }

    public Export(int priceExport, String nationImport) {
        this.priceExport = priceExport;
        this.nationImport = nationImport;
    }

    public Export(String codeProduct, String name, int price, int quantum, String producer, int priceExport, String nationImport) {
        super(codeProduct, name, price, quantum, producer);
        this.priceExport = priceExport;
        this.nationImport = nationImport;
    }

    public int getPriceExport() {
        return priceExport;
    }

    public void setPriceExport(int priceExport) {
        this.priceExport = priceExport;
    }

    public String getNationImport() {
        return nationImport;
    }

    public void setNationImport(String nationImport) {
        this.nationImport = nationImport;
    }

    @Override
    public String toString() {
        return "Export{" + super.toString() +
                ", priceExport=" + priceExport +
                ", nationImport='" + nationImport + '\'' +
                '}';
    }
}
