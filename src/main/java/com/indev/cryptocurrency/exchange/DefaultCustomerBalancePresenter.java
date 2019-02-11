package com.indev.cryptocurrency.exchange;

public class DefaultCustomerBalancePresenter implements CustomerBalancePresenter{
    private String getBalanceRepresentation(int balance) {
        return balance + ":$";
    }

    @Override
    public String getBalanceRepresentation(String cryptoName, int cryptoBalance, int balance) {
        if(cryptoName.isEmpty()){
            return getBalanceRepresentation(balance);
        }
        return balance+":$,"+cryptoBalance+":"+cryptoName;
    }
}
