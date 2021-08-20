package anabibelforscher.dio.desafio.main;

import anabibelforscher.dio.desafio.model.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfoExtrato() {
        System.out.println("--- EXTRATO CONTA CORRENTE ---");
        super.imprimirInfoExtrato();
    }
}
