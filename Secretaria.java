package teste;

//herda da classe pessoa
public class Secretaria extends Pessoa {
	
	//atributos
	private int id; 
	private String usuario; 
	private String senha;

	//constutor
	public Secretaria(String nome, String cpf, String telefone, int id,String usuario, String senha) {
		
		super(nome,cpf,telefone);
		
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		
	}

	//-----------metodos do ID--------------
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	//------------------------------------

	//-----------metodos do usuario----------------
	public String getUsuario() {
		return usuario;
    }
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	//----------------------------------------

	//-----------metodos da senha--------------
	public String getSenha() {
		return senha;	
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	//-------------------------------------
	
}
		
		
		
		
		
		
		
		
		
