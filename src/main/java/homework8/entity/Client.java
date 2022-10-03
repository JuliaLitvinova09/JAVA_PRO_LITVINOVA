package homework8.entity;

public class Client {
    private String account;
    private String surname;
    private String id;
    private double amount;

    public Client(String id, String surname, String account, double amount) {
        this.id = id;
        this.surname = surname;
        this.account = account;
        this.amount = amount;
    }

    public Client() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
