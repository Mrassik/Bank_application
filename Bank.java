public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void showCustomerInfo(Customer customer) {
        System.out.println("Bank: " + bankName);
        System.out.println(customer);
    }
}