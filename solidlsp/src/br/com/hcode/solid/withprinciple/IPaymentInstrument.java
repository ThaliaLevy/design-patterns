package br.com.hcode.solid.withprinciple;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();

}
