package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack1");
        account.setBalance(5);
        account.setPassword("1278456");
        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account Password: " + account.getPassword());

    }
}
