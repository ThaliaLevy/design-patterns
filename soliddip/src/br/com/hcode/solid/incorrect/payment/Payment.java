package br.com.hcode.solid.incorrect.payment;

import br.com.hcode.solid.incorrect.model.MySQLProduct;

public class Payment {
	public void pay(String productID) {

		MySQLProduct dbProduct = new MySQLProduct();
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}
}
