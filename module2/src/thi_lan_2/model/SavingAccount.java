package thi_lan_2.model;

public class SavingAccount extends BankAccount{
    private double savedMoney;
    private String dateSent;
    private double interestRate;
    private int period;

    public SavingAccount() {
    }

    public SavingAccount(double savedMoney, String dateSent, double interestRate, int period) {
        this.savedMoney = savedMoney;
        this.dateSent = dateSent;
        this.interestRate = interestRate;
        this.period = period;
    }

    public SavingAccount(String codeAccount, String name, String dateCreated, double savedMoney, String dateSent, double interestRate, int period) {
        super(codeAccount, name, dateCreated);
        this.savedMoney = savedMoney;
        this.dateSent = dateSent;
        this.interestRate = interestRate;
        this.period = period;
    }

    public double getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(double savedMoney) {
        this.savedMoney = savedMoney;
    }

    public String getDateSent() {
        return dateSent;
    }

    public void setDateSent(String dateSent) {
        this.dateSent = dateSent;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() +
                ", savedMoney=" + savedMoney +
                ", dateSent='" + dateSent + '\'' +
                ", interestRate=" + interestRate +
                ", period='" + period + '\'' +
                '}';
    }
}
