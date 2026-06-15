package enums;

// ENUM COMPLETO
public enum Banco {

    ITAU(341, "Itaú"),
    BRADESCO(237, "Bradesco"),
    CAIXA(104, "Caixa Econômica");

    private final int codigo;
    private final String nomeExibicao;

    Banco(int codigo, String nomeExibicao) {
        this.codigo = codigo;
        this.nomeExibicao = nomeExibicao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }
}