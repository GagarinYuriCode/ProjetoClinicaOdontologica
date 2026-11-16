package teste;

public class Paciente extends Pessoa {
	
	private int codigo;
	
	public Paciente(String nome, 
			        String cpf, 
			        String telefone, 
			        int codigo) {
		
		super(nome,cpf,telefone);
		
		this.codigo = codigo;
		
	}
	
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n" + super.toString();
    }

    @Override
    public boolean equals(Object objeto) {

        if (this == objeto) return true;

        if (!(objeto instanceof Paciente)) return false;

        Paciente verificação = (Paciente) objeto;

        return codigo == verificação.codigo;
    }
}


