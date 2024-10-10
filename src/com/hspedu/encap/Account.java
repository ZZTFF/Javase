package com.hspedu.encap;

public class Account {
    private String name;
    private String password;
    private double balance;
//两个构造器
    public Account(String password, String name, double balance) {
        this.setName(name);
        this.setPassword(password);
        this.setBalance(balance);
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() == 2 ||name.length() == 3 ||name.length() == 4){
            this.name = name;
        }else{
            System.out.println("Invalid name");
            this.name = "NULL";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else{
            System.out.println("Invalid password");
            this.password = "000000";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        }else{
            System.out.println("Invalid balance");
            this.balance = 0;
        }
    }

}

