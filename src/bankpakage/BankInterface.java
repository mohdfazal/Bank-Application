package bankpakage;

public interface BankInterface {
    public int checkBalance(String password);

    public String addMoney(int money, String password);
    public String withdrawMoney(int money, String password);
    public String changePassword(String oldPassword, String newPassword);
    public double totalInterest(int year);
}
