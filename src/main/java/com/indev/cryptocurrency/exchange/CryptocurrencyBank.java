package com.indev.cryptocurrency.exchange;

import java.util.ArrayList;
import java.util.List;

public class CryptocurrencyBank {

    private List<String> supportedCryptoCurrency = new ArrayList<>();
    private List<Customer> cryptocurrencySellers = new ArrayList<>();

    public void addSupportedCryptoCurrency(String cryptoCurrencyName) {
        supportedCryptoCurrency.add(cryptoCurrencyName);
    }

    public int requestTransaction(Customer buyerCustomer, int cryptoBalance, String cryptoName) {
//        for (Customer seller:cryptocurrencySellers){
//            if()
//        }

        return 0;
    }

    public void addSeller(Customer sellerCustomer) {
    }
}
