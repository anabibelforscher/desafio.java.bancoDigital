package anabibelforscher.dio.desafio.main;

import anabibelforscher.dio.desafio.model.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfoExtrato() {
        System.out.println("--- EXTRATO CONTA POUPANÇA ---");
        super.imprimirInfoExtrato();
    }
}
