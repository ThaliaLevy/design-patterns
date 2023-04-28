package br.com.hcode.solid.correct.model;

public class MySQLProduct implements IDbProduct {

	public String getProductById(String productID) {
		return "Mysql:Exibindo dados do Produto " + productID;
	}
}
