package teste;

// herda a classe pessoa
public class Dentista extends Pessoa {
	
	//atributos
	private String cro;
    private String especialidade;
    private String senha;

	//construtor
	public Dentista(String nome, String cpf, 
			        String telefone,String cro,
			        String especialidade,String senha) {
		
		super(nome,cpf,telefone);
		
		this.cro = cro;
		this.especialidade = especialidade;
		this.senha = senha;
	}
	//--------metodos do CRO-----------
	public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }
	//---------------------------------

	//--------metodos da especialidade---------------------
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
	//------------------------------------------------------
	
	//--------metodos da senha----------------
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
	//----------------------------------------

	//--------metodos da toString e equals----------------
	@Override
    public String toString() {
        return super.toString() + "\nCRO: " + cro + "\nEspecialidade: " + especialidade;
    }

	@Override
    public boolean equals(Object objeto) {

        if (this == objeto) return true;

        if (!(obj instanceof Dentista)) return false;

        Dentista castVerificacao = (Dentista) objeto;
        return cro.equals(castVerificacao.cro);
    }

}
