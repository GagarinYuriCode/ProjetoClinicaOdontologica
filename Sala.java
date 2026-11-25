package teste;

public class Sala {
  //atrinutos
    private int numero;
    private String descricao;

  //construtor
    public Sala(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

  //---------metodos para o numero da sala---------
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
  //-----------------------------------------------
  
  //---------metodos para descrição do procedimento na sala---------

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  //----------------------------------------------------------------

  //---------metodos toString e equals---------
    @Override
    public String toString() {
        return "Sala: "+numero+"\nDescrição: "+descricao;
    }

    @Override
    public boolean equals(Object objeto) {

        if (this == objeto) { 
          return true;
        }
        if (!(objeto instanceof Sala)) {
          return false;
        }
        Sala castVerificar = (Sala) objeto;

        return numero == castVerificar.numero;
    }
}
