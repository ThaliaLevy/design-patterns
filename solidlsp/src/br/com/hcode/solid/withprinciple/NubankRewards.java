package br.com.hcode.solid.withprinciple;

public class NubankRewards implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {
        //validações
        System.out.println("Limite OK, Rewards OK!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Pontuação creditada no Programa Rewards!");
    }
}
