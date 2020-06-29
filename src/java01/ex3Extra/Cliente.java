package java01.ex3Extra;

public class Cliente {

    protected String numeroRG;
    protected String numeroCPF;
    protected String endereco;
    protected String nome;

    public Cliente() {
        this("01.234.567-9");
    }

    public Cliente(String numeroRG) {
        this(numeroRG,"123.456.678-90","Rua Etc","João");
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
