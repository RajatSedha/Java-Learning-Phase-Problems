package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount bankaccount = new BankAccount();
	bankaccount.setBalance(50000000);
	bankaccount.setAccountNumber(1234);
	bankaccount.setCustomerName("Rajat Sedha");
    bankaccount.setPhoneNumber(1000000000);
    bankaccount.setEmail("rajatsedha@gmail.com");
        System.out.println("Balance is "+bankaccount.getBalance());
        System.out.println("Account Number is "+bankaccount.getAccountNumber());
        System.out.println("Name is "+bankaccount.getCustomerName());
        System.out.println("Phone Number is "+bankaccount.getPhoneNumber());
        System.out.println("Email is "+bankaccount.getEmail());
        System.out.println("Deposited amount is "+bankaccount.depositeFunds(50000));
        System.out.println("Withdrawn funds are "+bankaccount.withdrawFunds(70000000));
    }
}
