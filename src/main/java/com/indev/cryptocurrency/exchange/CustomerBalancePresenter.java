package com.indev.cryptocurrency.exchange;

public interface CustomerBalancePresenter {
    String getBalanceRepresentation(String cryptoName, int cryptoBalance, int balance);
}
