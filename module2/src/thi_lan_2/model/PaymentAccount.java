package thi_lan_2.model;

public class PaymentAccount extends BankAccount {
    private int cardNumber;
    private int money;

    public PaymentAccount() {
    }

    public PaymentAccount(int cardNumber, int money) {
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public PaymentAccount(String codeAccount, String name, String dateCreated, int cardNumber, int money) {
        super(codeAccount, name, dateCreated);
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" + super.toString() +
                ", cardNumber=" + cardNumber +
                ", money=" + money +
                '}';
    }
}
