public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("KZ123456", 1000);
        BankAccount account2 = new BankAccount("KZ654321", 2000);

        Customer customer1 = new Customer("Ali", 1, account1);
        Customer customer2 = new Customer("Amina", 2, account2);

        Bank bank = new Bank("National Bank");

        bank.showCustomerInfo(customer1);
        bank.showCustomerInfo(customer2);

        // Сравнение счетов
        if (account1.getBalance() > account2.getBalance()) {
            System.out.println("У Ali больше денег");
        } else {
            System.out.println("У Amina больше денег");
        }
    }
}
