package bank.application;

public interface BankInterface {
    public int checkBalance(String password);
    public String addMoney (int money );
    public String withdrawMoney (int money,String password);
    public String changePassword (String oldPassword, String newPassWord);
    public double calculateTotalInterest(int years, String password);


    /*
    //TODO
     transfer Money within the same bank



     */

}
