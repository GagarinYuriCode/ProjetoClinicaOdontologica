package teste;

public class Dentista extends Pessoa {

	private String cro;
    private String especialidade;
    private String senha;
	
	public Dentista(String nome, String cpf, 
			        String telefone,String cro,
			        String especialidade,String senha
			        ) {
		
		super(nome,cpf,telefone);
		
		this.cro = cro;
		this.especialidade = especialidade;
		this.senha = senha;
	}

	public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        return super.toString() + "\nCRO: " + cro + "\nEspecialidade: " + especialidade;
    }

    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Dentista)) return false;

        Dentista verificação = (Dentista) obj;

        return cro.equals(verificação.cro);
    }

}
