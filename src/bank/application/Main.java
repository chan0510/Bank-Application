package bank.application;

public class Main {
    public static void main(String[] args) {
        SBI account1 = new SBI(100000,"12345","Dev");
        SBI account2 = new SBI(150000,"456","no one");
        HdfcBank account3 = new HdfcBank(1000,"789","john");
        System.out.println(account1.checkBalance("123"));
        System.out.println(account1.checkBalance("12345"));
        System.out.println(account2.withdrawMoney(5000,"456"));
        System.out.println(account1.calculateTotalInterest(20,"12345"));
    }
}