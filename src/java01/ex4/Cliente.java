package java01.ex4;

public class Cliente {

    protected String numeroRG;
    protected String numeroCPF;
    protected String endereco;
    protected String nome;

    public Cliente() {
    }

    public Cliente(String numeroRG) {
        this.numeroRG = numeroRG;
    }

    public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
        this.numeroRG = numeroRG;
        this.numeroCPF = numeroCPF;
        this.endereco = endereco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroRG='" + numeroRG + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
