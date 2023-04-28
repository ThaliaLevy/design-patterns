package br.com.hcode.solid.correct.factory;

import br.com.hcode.solid.correct.model.Db;
import br.com.hcode.solid.correct.model.IDbProduct;
import br.com.hcode.solid.correct.model.MongoDBProduct;
import br.com.hcode.solid.correct.model.MySQLProduct;

public class DbProductFactory {

	public static IDbProduct create(Db type) {
		
		if (type == Db.MYSQL) {
			return new MySQLProduct();
		} else {
			return new MongoDBProduct();
		}
	}

}
