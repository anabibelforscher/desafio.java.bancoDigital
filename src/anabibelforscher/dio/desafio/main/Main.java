package anabibelforscher.dio.desafio.main;

import anabibelforscher.dio.desafio.model.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente clienteAna = new Cliente();
        clienteAna.setNome("Ana");

        Conta contaCorrente = new ContaCorrente(clienteAna);
        contaCorrente.depositar(100);
        Conta poupanca = new ContaPoupanca(clienteAna);
        contaCorrente.transferir(75, poupanca);

        contaCorrente.imprimirInfoExtrato();
        poupanca.imprimirInfoExtrato();
    }
}
