package pl.pjait;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John John",
                                    "48654564897512354678998854",
                                            1000.00);
        BankAccount account2 = new BankAccount("John John",
                                     "1111111111111111111111111",
                                            1200.00);

        account1.deposit();
        account2.withdraw();
    }
}
