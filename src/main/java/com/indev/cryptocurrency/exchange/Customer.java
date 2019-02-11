package com.indev.cryptocurrency.exchange;

public class Customer {

    String cryptocurrencyName;
    int cryptocurrencyBalance;

    public Customer withCryptocurrency(String cryptocurrencyName, int cryptocurrencyBalance) {
        this.cryptocurrencyName = cryptocurrencyName;
        this.cryptocurrencyBalance = cryptocurrencyBalance;
        return this;
    }

    @Override
    public String toString() {
        return "0:$" +
                "," +
                cryptocurrencyBalance +
                ":" +
                cryptocurrencyName;
    }

    public Customer withBalance(int i) {
        return null;
    }
}
