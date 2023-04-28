package br.com.hcode.solid.correct.payment;

import br.com.hcode.solid.correct.factory.DbProductFactory;
import br.com.hcode.solid.correct.model.Db;
import br.com.hcode.solid.correct.model.IDbProduct;

public class Payment {
	public void pay(String productID) {

		IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
		//IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
		
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}
}
