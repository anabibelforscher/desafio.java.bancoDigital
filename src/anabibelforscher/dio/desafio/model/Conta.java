package anabibelforscher.dio.desafio.model;

import anabibelforscher.dio.desafio.main.Cliente;

public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1000;

    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    @Override
    public void sacar(double valorSaque) {
        saldo = saldo - valorSaque;
    }

    @Override
    public void transferir(double valorTransferencia, Conta contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

    @Override
    public void imprimirInfoExtrato() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número da conta: %d", numeroConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {return agencia;}

    public int getNumeroConta() {return numeroConta;}

    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {this.saldo = saldo;}
}
