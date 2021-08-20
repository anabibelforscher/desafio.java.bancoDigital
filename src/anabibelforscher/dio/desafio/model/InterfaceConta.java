package anabibelforscher.dio.desafio.model;

public interface InterfaceConta {

    void depositar(double valorDeposito);

    void sacar(double valorSaque);

    void transferir(double valorTransferencia, Conta contaDestino);

    void imprimirInfoExtrato();
}
