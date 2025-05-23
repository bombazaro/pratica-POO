package ads.poo;

public class Disciplina {
    private String nome;
    private String sigla;
    private String codigo;

    public Disciplina(String nome, String sigla, String codigo) {
        this.nome = nome;
        this.sigla = sigla;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nome: ").append(nome).append('\n');
        sb.append("sigla: ").append(sigla).append('\n');
        sb.append("codigo: ").append(codigo).append('\n');
        return sb.toString();
    }
}
