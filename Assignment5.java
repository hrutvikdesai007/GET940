//Written by Hrutvik Desai

import java.util.*;
import java.io.*;

class Account {
    private int accountNo;
    private int accountBalance;
    private String accountPassword;
    private String bankName;

    Account() {
    }

    public Account(int accountNo, int accountBalance, String accountPassword, String bankName) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountPassword = accountPassword;
        this.bankName = bankName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void displayAccount() {
        System.out.println("");
        System.out.println("********Account Details********");
        System.out.println("");
        System.out.println("Account Number     : " + accountNo);
        System.out.println("Account Balance    : " + accountBalance);
        System.out.println("Account Password   : " + accountPassword);
        System.out.println("Bank Name          : " + bankName);
        System.out.println("");
    }

}

public class Assignment5 {

    public static void main(String args[]) {
        int acno;
        int acbal;
        String acpass;
        String bname;

        System.out.println("");
        System.out.println("********ASSIGNMENT 5********");
        System.out.println("");

        System.out.println("********Bank Account********");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Account Number   : ");
        acno = sc.nextInt();
        System.out.println("Enter the Bank Balance      :  ");
        acbal = sc.nextInt();
        System.out.println("Enter the Account Passsword :");
        acpass = sc.next();
        System.out.println("Enter the Bank Name : ");
        bname = sc.next();

        Account a = new Account(acno, acbal, acpass, bname);
        a.displayAccount();

    }

}