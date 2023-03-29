package bank.application;

import java.util.UUID;

public class SBI implements  BankInterface{

    private  int balance;
    private String accountNo;
    private String password;
    private String name;
    private static double reteOfInterest=6.0;
    public SBI(int balance, String password, String name) {
        this.accountNo= UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }
    @Override
    public int checkBalance(String password) {
        if(password==this.password)
        return balance;
        else
        return -1;
    }

    @Override
    public String addMoney(int money) {
        balance=balance+money;
        String message=money+" money has been added to the account "+accountNo+" the total balance is now "+balance;
        return message;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(password==this.password){
            if(money>balance) return  " Insufficent balance";
            else {
                balance=balance-money;
                return "Money withdraw successfully. Remaining balance is"+balance;
            }
        }
        else return " Wrong Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassWord) {
        if(this.password.equals(oldPassword)){
            this.password=newPassWord;
            return  " New Password is "+newPassWord;
        }
        else
        return "Wrong Password";
    }

    @Override
    public double calculateTotalInterest(int years, String password) {
        double interest= balance*reteOfInterest*years/100;
        return interest;
    }
}
