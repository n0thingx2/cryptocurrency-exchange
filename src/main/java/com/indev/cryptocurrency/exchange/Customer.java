package com.indev.cryptocurrency.exchange;

public class Customer {

    private String cryptocurrencyName;
    private int cryptocurrencyBalance;
    private int balance;

    public Customer withCryptocurrency(String cryptocurrencyName, int cryptocurrencyBalance) {
        this.cryptocurrencyName = cryptocurrencyName;
        this.cryptocurrencyBalance = cryptocurrencyBalance;
        return this;
    }

    @Override
    public String toString() {
        return balance +
                ":$," +
                cryptocurrencyBalance +
                ":" +
                cryptocurrencyName;
    }

    public Customer withBalance(int balance) {
        this.balance = balance;
        return this;
    }
}
