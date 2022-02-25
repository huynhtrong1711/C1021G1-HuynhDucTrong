package thi_lan_2.model;

public abstract class BankAccount {
    private int id;
    private static int autoId = 0;
    private String codeAccount;
    private String name;
    private String dateCreated;

    public BankAccount() {
    }

    public BankAccount(String codeAccount, String name, String dateCreated) {
        autoId++;
        this.id = autoId;
        this.codeAccount = codeAccount;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", codeAccount='" + codeAccount + '\'' +
                ", name='" + name + '\'' +
                ", dateCreated='" + dateCreated;
    }
}
