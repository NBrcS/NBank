package Operations;

import OwnerData.BankData;

public class Interfaces {
    public static void firstInterface(){
        System.out.println("Welcome to the NBank!!! What do you want now?\n");
        System.out.println("[ 1 ] - Register");
        System.out.println("[ 2 ] - Login");
        System.out.println("[ 3 ] - Just Testing");
        System.out.println("[ 0 ] - Exit the program");

        System.out.print("\nChoice: ");
    }

    public static void menu(){
        System.out.println("good to see you again " + BankData.getOwnerName() + ", what to do now?");
        System.out.println("[ 1 ] - Deposit");
        System.out.println("[ 2 ] - Withdraw");
        System.out.println("[ 3 ] - Invests menu");
        System.out.println("[ 0 ] - Return");

        System.out.print("\nChoice: ");
    }

    public static void investMenu(){
        System.out.println("These are the available options\n");
        System.out.println("[ 1 ] - Real state founds");
        System.out.println("[ 0 ] - Return");

        System.out.print("\nChoice: ");
    }

    public static void yesNo(){
        System.out.println("[ 1 ] - Yes");
        System.out.println("[ 0 ] - No");

        System.out.print("Choice: ");
    }
}
