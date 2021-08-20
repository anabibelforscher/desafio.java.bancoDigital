package anabibelforscher.dio.desafio.main;

import anabibelforscher.dio.desafio.model.Conta;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> listaContas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
