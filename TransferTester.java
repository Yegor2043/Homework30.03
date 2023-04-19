package lesson1.japanese.bank;

public class TransferTester {
    public static void main(String[] args) {
        Account a1 = new Account("215", "Dima Smirnov", 193);
        Account a2 = new Account("456", "Sergey Petrov", 45);
        a1.transfer(a2, 45);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
