package br.com.hcode.solid.noprinciple;

public class DebitCard extends NubankCard {


    @Override
    public void validate() throws Exception {

        System.out.println("Verificando Saldo!");
        System.out.println("Saldo disponível!");
    }
}
