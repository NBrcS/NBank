package OwnerData;

import java.util.Date;

public class BankData {
    protected static double patrimony;
    protected static String accountNumber;
    protected static String ownerName;
    protected static String ownerAddress;
    protected static String ownerPassword;
    protected static Date onCreateAccountData;

    public static double getPatrimony() {
        return patrimony;
    }
    public static void setPatrimony(double patrimony) {
        BankData.patrimony = patrimony;
    }
    public static String getAccountNumber() {
        return accountNumber;
    }
    public static String getOwnerName() {
        return ownerName;
    }
    public static String getOwnerAddress() {
        return ownerAddress;
    }

    public static String getOwnerPassword() {
        return ownerPassword;
    }
    public static Date getOnCreateAccountData() {
        return onCreateAccountData;
    }
}
