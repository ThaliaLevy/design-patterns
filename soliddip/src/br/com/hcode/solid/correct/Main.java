package br.com.hcode.solid.correct;

import br.com.hcode.solid.correct.payment.Payment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");
    }
}
