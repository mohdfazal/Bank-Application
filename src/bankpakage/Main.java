package bankpakage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your password");
        String password = sc.nextLine();
        System.out.println("Enter your balance");
        int balance = sc.nextInt();
        SBI sbi = new SBI(balance, password, name);

        sbi.name = "fazal";
        System.out.println(sbi.name);
        String addedmoney = sbi.addMoney(5, "123");
        System.out.println(addedmoney);



    }
}