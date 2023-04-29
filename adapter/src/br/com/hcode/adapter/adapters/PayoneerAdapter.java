package br.com.hcode.adapter.adapters;

import br.com.hcode.adapter.payoneer.Payoneer;
import br.com.hcode.adapter.paypal.IPayPalPayments;
import br.com.hcode.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
	private Token token;
	private Payoneer payoneer;

	public PayoneerAdapter(Payoneer payoneer) {
		this.payoneer = payoneer;
		System.out.println("Adaptando o Payoneer utilizando os métodos padrões do PayPal");
	}

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.payoneer.sendPayment();
	}

	@Override
	public void paypalReceive() {
		this.payoneer.receivePayment();
	}
}
