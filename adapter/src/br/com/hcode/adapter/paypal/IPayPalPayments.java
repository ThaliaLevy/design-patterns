package br.com.hcode.adapter.paypal;

import br.com.hcode.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
