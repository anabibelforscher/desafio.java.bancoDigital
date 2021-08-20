package anabibelforscher.dio.desafio.main;

public class Cliente {

    public enum TipoPessoa {FISICA, JURIDICA}
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    private String documento;
    private String nome;
    private TipoPessoa tipoPessoa;

    public String getDocumento() {
        return documento;
    }

    private void setDocumento(String documento, TipoPessoa tipoPessoa){
        this.documento = documento;
        this.tipoPessoa = tipoPessoa;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new ArithmeticException("Documento não pode ser nulo ou vazio");
        }
        if (documento.length()== TAMANHO_CPF){
            setDocumento(documento,tipoPessoa = TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ){
            setDocumento(documento,tipoPessoa = TipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
