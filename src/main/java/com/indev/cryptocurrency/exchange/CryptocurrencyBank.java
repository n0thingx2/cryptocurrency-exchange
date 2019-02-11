package com.indev.cryptocurrency.exchange;

import java.util.ArrayList;
import java.util.List;

public class CryptocurrencyBank {

    List<String> supportedCryptoCurrency = new ArrayList<String>();

    public void addSupportedCryptoCurrency(String cryptoCurrencyName) {
        supportedCryptoCurrency.add(cryptoCurrencyName);
    }

    public int requestTransaction(Customer buyerCustomer, int i, String bitcoin) {
        return 0;
    }

    public void addSeller(Customer sellerCustomer) {
    }
}
