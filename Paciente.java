package teste;

//herda a classe pessoa
public class Paciente extends Pessoa {
	//atributo
	private int codigo;

	//constutor
	public Paciente(String nome, String cpf, String telefone, int codigo) {
		
		super(nome,cpf,telefone);
		
		this.codigo = codigo;
		
	}

	//------------metodos do codigo---------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
	//--------------------------------------

	//-----------metodos toString e equals----------------------
    @Override
    public String toString() {
        return "codigo: " + codigo + "\n" + super.toString();
    }

    @Override
    public boolean equals(Object objeto) {

        if (this == objeto) {
			return true;
		}
		
        if (!(objeto instanceof Paciente)) { 
			return false;
		}
		
        Paciente castVerificacao = (Paciente) objeto;

        return codigo == castVerificacao.codigo;
    }
}


