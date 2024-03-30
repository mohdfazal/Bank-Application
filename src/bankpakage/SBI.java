package bankpakage;

import bankpakage.BankInterface;

import java.util.UUID;

public class SBI implements BankInterface {
    private int balance;
    private String accountNo;
    private String password;
    public String name;
    public static int rateOfInterest;
    public SBI(int balance , String password , String name) {
        this.accountNo = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }

    @Override
    public int checkBalance(String password) {
        if(this.password == password){
            return balance;
        }
        return -1;
    }

    @Override
    public String addMoney(int money, String password) {
        balance = balance + money;
        String message = "The amoount " + money + "has been added to your account number "+ accountNo + "and the total balance  is " + balance;
        return message;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(this.password.equals(password)){
            if(money > balance){
                return "Insufficient balance " + balance;
            }
            else {
                String message = "The amount " + money + " has been withdrawn successfully remaining balance is " + balance;
                return message;
            }
        }
        else {
            return "Incorrect Password";
        }

    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Password Updated Successfully";
        }
        else {
            return "You entered the wrong password";
        }
    }

    @Override
    public double totalInterest(int year) {
        double interest = balance * rateOfInterest * year/100;
        return interest;
    }
}
