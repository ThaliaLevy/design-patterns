package br.com.hcode.chainofresponsibility;

import br.com.hcode.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.hcode.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.hcode.chainofresponsibility.middlewares.Middleware;
import br.com.hcode.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.registerUser("master@hcode.com.br", "8765rtyuTRE##%");
        server.registerUser("user@hcode.com.br", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        init();

        boolean done;

		do {
			System.out.println("Digite o e-mail: ");
			String email = reader.readLine();
			
			System.out.println("Digite sua senha: ");
			String password = reader.readLine();
			
			done = server.logIn(email, password);
		} while (!done);

	}
}
