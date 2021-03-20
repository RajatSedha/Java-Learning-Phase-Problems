package com.company;

public class BankAccount {
//    account number, balance, customer name, email and phone number.
    private int accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;

//    Create getters and setters for each field


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    // Create two additional methods
    // 1.ent To allow the customer to deposit funds (this should increm the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    public long depositeFunds(long a){
        return balance+=a;
    }
    public double withdrawFunds(long b){
        if(b>balance){
            return 0;
        }
        return b;
    }

}

