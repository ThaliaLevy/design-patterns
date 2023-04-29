package br.com.hcode.bridge.platforms;

public class TwitchTV implements IPlatform{
    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: Transmissão Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o Canal");
    }
}
