package OwnerData;

import java.util.Date;

public class Register extends BankData{
    public static void setAccountNumber(String accountNumber) {
        BankData.accountNumber = accountNumber;
    }
    public static void setOwnerName(String ownerName) {
        BankData.ownerName = ownerName;
    }
    public static void setOwnerPassword(String ownerPassword) {
        BankData.ownerPassword = ownerPassword;
    }
    public static void setOwnerAddress(String ownerAddress) {
        BankData.ownerAddress = ownerAddress;
    }
    public static void setOnCreateAccountData(Date onCreateAccountData) {
        BankData.onCreateAccountData = onCreateAccountData;
    }
}
