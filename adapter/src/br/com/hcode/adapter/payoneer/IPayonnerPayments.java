package br.com.hcode.adapter.payoneer;

import br.com.hcode.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();

}
