package Operations;

import OwnerData.BankData;

public class iopatrimony {

    public static void withdraw(double w_value){
        double actualPatrimony = BankData.getPatrimony();

        if(actualPatrimony < w_value){
            System.out.println("Insufficient Patrimony");
        }
        else{
            double afterWithdraw = BankData.getPatrimony() - w_value;

            BankData.setPatrimony(afterWithdraw);
            System.out.println("amount withdrawn successfully");
        }
    }

    public static void deposit(double d_value){
        double afterDeposit = BankData.getPatrimony() + d_value;

        BankData.setPatrimony(afterDeposit);
        System.out.print("Successfully deposited! ");
    }
}
