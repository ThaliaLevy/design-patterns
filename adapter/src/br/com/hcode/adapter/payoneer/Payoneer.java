package br.com.hcode.adapter.payoneer;

import br.com.hcode.adapter.utils.Token;

public class Payoneer implements IPayonnerPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamentos via Payoneer");
    }
}
