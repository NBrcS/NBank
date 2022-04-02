package Operations;

import Invests.REF;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class REFcalculator extends Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void Calculate(){
        double D_info;
        int months;

        System.out.print("Type here your first investment: ");
        D_info = scanner.nextDouble();
        REF.setFirstInvest(D_info);

        System.out.print("Type here the monthly contribution: ");
        D_info = scanner.nextDouble();
        REF.setMonthlyContribution(D_info);

        System.out.print("Type here how many months you want keep your money working: ");
        months = scanner.nextInt();

        System.out.print("Type the yield rate (in local coin) : ");
        D_info = scanner.nextDouble();
        REF.setYieldRate(D_info);

        System.out.print("Type it here the price of FI: ");
        D_info = scanner.nextDouble();
        REF.setPriceFI(D_info);


        REF.setInitialQuotes();
        for (int i = 0; i < months - 1; i++) {
            REF.atMonth();
        }

        REF.printInvest();
    }
}
