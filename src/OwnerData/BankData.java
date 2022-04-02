package OwnerData;

import java.util.Date;

public class BankData {
    private static double patrimony;
    private static String accountNumber;
    private static String ownerName;
    private static String ownerAddress;
    private static Date onCreateAccountData;

    public static double getPatrimony() {
        return patrimony;
    }
    public static void setPatrimony(double patrimony) {
        BankData.patrimony = patrimony;
    }
    public static String getAccountNumber() {
        return accountNumber;
    }
    public static void setAccountNumber(String accountNumber) {
        BankData.accountNumber = accountNumber;
    }
    public static String getOwnerName() {
        return ownerName;
    }
    public static void setOwnerName(String ownerName) {
        BankData.ownerName = ownerName;
    }
    public static String getOwnerAddress() {
        return ownerAddress;
    }
    public static void setOwnerAddress(String ownerAddress) {
        BankData.ownerAddress = ownerAddress;
    }
    public static Date getOnCreateAccountData() {
        return onCreateAccountData;
    }
    public static void setOnCreateAccountData(Date onCreateAccountData) {
        BankData.onCreateAccountData = onCreateAccountData;
    }
}
