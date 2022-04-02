import Operations.Interfaces;
import Operations.REFcalculator;
import Operations.iopatrimony;
import OwnerData.BankData;
import OwnerData.Register;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
            int option;
            boolean exit = false;

        do {

            Interfaces.firstInterface();
            do {
                option = scanner.nextInt();

                if(option <0 || option > 3) {
                    System.out.print("Invalid option, try again: ");
                }
            } while (option <0 || option > 3);

            switch (option) {
                case 1 -> {
                    String s_info;

                    System.out.print("First, write your name: ");
                    s_info = scanner.nextLine();
                    Register.setOwnerName(s_info);

                    System.out.print("Now, your address: ");
                    s_info = scanner.nextLine();
                    Register.setOwnerAddress(s_info);

                    System.out.print("For last, your password: ");
                    s_info = scanner.nextLine();
                    Register.setOwnerPassword(s_info);

                    s_info = "" + new Random().nextInt(10000);
                    Register.setAccountNumber(s_info);
                    System.out.print("That is your account number: " + BankData.getAccountNumber());

                    System.out.println("Your register are finished.\n");
                    break;
                }
                case 2 -> {
                    boolean validLogin = true;

                    do {
                        String s_info;
                        boolean validAccountNumber = false;
                        boolean validPassword = false;

                        System.out.print("Write your account number: ");
                        s_info = scanner.nextLine();
                        if (s_info.equals(BankData.getAccountNumber())) {
                            validAccountNumber = true;
                        }

                        System.out.print("Write your password: ");
                        s_info = scanner.nextLine();
                        if (s_info.equals(BankData.getOwnerPassword())) {
                            validPassword = true;
                        }

                        if (!validAccountNumber || !validPassword) {
                            System.out.println("Incorrect password or account number.\n");
                            validLogin = false;

                            System.out.println("Would you want to try again? \n");
                            Interfaces.yesNo();
                            if(scanner.nextInt() == 0) break;
                        }
                    } while (!validLogin);

                    if(validLogin){
                        Interfaces.menu();
                        option = scanner.nextInt();

                        switch (option) {
                            case 1 ->{
                                double deposit;

                                System.out.print("How much do you want deposit? ");
                                deposit = scanner.nextDouble();

                                iopatrimony.deposit(deposit);
                            }
                            case 2 ->{
                                double withdraw;

                                System.out.print("How much do you want withdraw? ");
                                withdraw = scanner.nextDouble();

                                iopatrimony.withdraw(withdraw);
                            }
                            case 3 ->{
                                Interfaces.investMenu();
                                option = scanner.nextInt();

                                switch (option) {
                                    case 1 ->{
                                        REFcalculator.Calculate();
                                        break;
                                    }
                                    case 0 ->{
                                        break;
                                    }
                                }
                            }
                        }
                    }

                    break;
                }
                case 3 -> {
                    Interfaces.menu();
                    option = scanner.nextInt();

                    switch (option) {
                        case 1 ->{
                            double deposit;

                            System.out.print("How much do you want deposit? ");
                            deposit = scanner.nextDouble();

                            iopatrimony.deposit(deposit);
                        }
                        case 2 ->{
                            double withdraw;

                            System.out.print("How much do you want withdraw? ");
                            withdraw = scanner.nextDouble();

                            iopatrimony.withdraw(withdraw);
                        }
                        case 3 ->{
                            Interfaces.investMenu();
                            option = scanner.nextInt();

                            switch (option) {
                                case 1 ->{
                                    REFcalculator.Calculate();
                                    break;
                                }
                                case 0 ->{
                                    break;
                                }
                            }
                        }
                    }
                }
                case 0 ->{
                    exit = true;
                    break;
                }
            }
        }while(!exit);
    }
}
