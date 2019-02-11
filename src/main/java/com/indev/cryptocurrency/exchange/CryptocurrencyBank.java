package com.indev.cryptocurrency.exchange;

import java.util.ArrayList;
import java.util.List;

public class CryptocurrencyBank{

    private List<String> supportedCryptoCurrency = new ArrayList<>();
    private List<Customer> cryptocurrencySellers = new ArrayList<>();

    private CurrencyPriceCalculator priceCalculator = new DefaultCurrencyPriceCalculator();

    public void addSupportedCryptoCurrency(String cryptoCurrencyName) {
        supportedCryptoCurrency.add(cryptoCurrencyName);
    }

    public int requestTransaction(Customer buyer, int cryptoAmount, String cryptoName) {
        if(isAnyCryptoSellersAvailable(cryptoName)){
            Customer seller = getSellerOfCryptoBalance(cryptoName);
            int finalAmount = priceCalculator.getCurrencyPrice(cryptoAmount);
            seller.sell(finalAmount, cryptoAmount);
            buyer.buy(cryptoName, finalAmount, cryptoAmount);
            return cryptoAmount;
        }
        return 0;
    }


    private Customer getSellerOfCryptoBalance(String cryptoName) {
        return cryptocurrencySellers.stream()
                .filter(seller -> seller.hasCryptocurrency(cryptoName))
                .findAny()
                .get();
    }

    private boolean isAnyCryptoSellersAvailable(String cryptoName) {
        return cryptocurrencySellers.stream()
                .anyMatch(availableSeller->availableSeller.hasCryptocurrency(cryptoName));
    }


    public void addSeller(Customer sellerCustomer) {
        cryptocurrencySellers.add(sellerCustomer);
    }
}
