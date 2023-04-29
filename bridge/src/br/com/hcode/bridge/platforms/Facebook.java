package br.com.hcode.bridge.platforms;

public class Facebook implements IPlatform {

    public Facebook(){
        configureRMTP();
        System.out.println("Facebook: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
