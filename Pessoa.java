package teste;


//classe abstrata, serve só de molde
public abstract class Pessoa {
	
	//atributos
	private String nome;
    private String cpf;
    private String telefone;

    //construtor
    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    //metodo pegar nome
    public String getNome() {
        return nome;
    }

    //metodo alterar nome
    public void setNome(String nome) {
        this.nome = nome;
    }

  //metodo de pegar cof
    public String getCpf() {
        return cpf;
    }

  //metodo alterar cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  //metodo pegar telefone
    public String getTelefone() {
        return telefone;
    }

  //metodo alterar telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    //metodo pra aparecer os dados
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }

    @Override
    //metodo pra comparar os objetos 
    public boolean equals(Object objeto) {
    	
    	//se for o mesmo objeto da mesma classe 
        if (this == objeto) {
        	return true;
        }

        //se o objeto não for da classe 
        if (!(objeto instanceof Pessoa)) {
        	return false;
        }
        	
        //se for da mesma classe diferencia os objetos pelo cpf
        Pessoa verificação = (Pessoa) objeto;

        return cpf.equals(verificação.cpf);
    }

}
