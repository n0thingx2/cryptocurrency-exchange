package com.indev.cryptocurrency.exchange;

public class Customer {

    private String cryptocurrencyName = "";
    private int cryptocurrencyBalance;
    private int balance;

    public Customer withCryptocurrency(String cryptocurrencyName, int cryptocurrencyBalance) {
        this.cryptocurrencyName = cryptocurrencyName;
        this.cryptocurrencyBalance = cryptocurrencyBalance;
        return this;
    }

    @Override
    public String toString() {
        return new DefaultCustomerBalancePresenter().getBalanceRepresentation(cryptocurrencyName, cryptocurrencyBalance,balance);
    }

    public Customer withBalance(int balance) {
        this.balance = balance;
        return this;
    }

    public boolean hasCryptocurrency(String cryptocurrencyName){
        return this.cryptocurrencyName.equals(cryptocurrencyName);
    }

    public void buy(String cryptoName, int amount, int cryptoAmount){
        cryptocurrencyName = cryptoName;
        reduceBalanceByAmount(amount);
        addCryptoBalanceByAmount(cryptoAmount);
    }

    public void sell(int amount, int cryptoAmount){
        addBalanceByAmount(amount);
        reduceCryptoBalanceByAmount(cryptoAmount);
    }

    private void addBalanceByAmount(int amount){
        balance += amount;
    }

    private void reduceBalanceByAmount(int amount){
        balance -= amount;
    }

    private void reduceCryptoBalanceByAmount(int cryptoAmount) {
        this.cryptocurrencyBalance -= cryptoAmount;
    }

    private void addCryptoBalanceByAmount(int cryptoAmount) {
        this.cryptocurrencyBalance += cryptoAmount;
    }
}
