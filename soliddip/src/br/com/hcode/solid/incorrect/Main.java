package br.com.hcode.solid.incorrect;

import br.com.hcode.solid.incorrect.payment.Payment;

public class Main {

    public static void main(String[] args) {
    	Payment payment = new Payment();
    	payment.pay("300");
    }
}
