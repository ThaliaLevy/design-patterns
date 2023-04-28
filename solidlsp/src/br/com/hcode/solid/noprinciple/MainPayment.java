package br.com.hcode.solid.noprinciple;

public class MainPayment {

    public static void main(String[] args) throws Exception {
        CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();

        card.validate();
        card.collectPayment();
    }
}
