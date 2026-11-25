package teste;

public class Procedimento {
  //atributos
  private int codigo;
  private String nome;
  private String descricao;
  private int duracao;

  public ProcedimentoClinico(int codigo, String nome, String descricao, int duracao) {

        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + "\nNome: " + nome
                + "\nDescrição: " + descricao
                + "\nDuração: " + duracao + " minutos";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof ProcedimentoClinico)) return false;

        ProcedimentoClinico outro = (ProcedimentoClinico) obj;

        return codigo == outro.codigo;
    }
  
}
