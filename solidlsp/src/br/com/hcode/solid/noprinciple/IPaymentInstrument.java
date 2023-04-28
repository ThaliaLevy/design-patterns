package br.com.hcode.solid.noprinciple;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();

}
