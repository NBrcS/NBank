import Invests.REF;
import Operations.REFcalculator;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;

        System.out.println("Type here, between the options, the invest type of you want to calculate: ");
        System.out.println("[ 1 ] - Real State Founds");
        System.out.println("[ 0 ] - Exit the program");

        System.out.print("\nChoice: ");
        do {
            option = scanner.nextInt();
        }while(option != 0 && option != 1);

        switch(option){
            case 1->{
                REFcalculator.Calculate();
                break;
            }

            default ->{}

        }
    }
}
