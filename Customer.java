public class Customer {
    private String name;
    private int customerId;
    private BankAccount account;
    
    public Customer(String name, int customerId, BankAccount account) {
        this.name = name;
        this.customerId = customerId;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', id=" + customerId + ", " + account + "}";
    }
}
