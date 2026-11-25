import java.util.ArrayList;
import classes.Dentista;

public class ControleDentista {

	private ArrayList<Dentista> dentistas;
	
	public ControleDentista() {
        dentistas = new ArrayList<>();
    }

    public void cadastrarDentista(Dentista dentista) {

        for (int i = 0; i < dentistas.size(); i++) {
 
        	Dentista existeNoVet = dentistas.get(i);
        	
            if (existeNoVet.getCro().equals(dentista.getCro())) {
                System.out.println("dentista já casdastrado");
                return;
            }
        }

        dentistas.add(dentista);
        System.out.println("Dentista cadastrado");
    }
    
    public Dentista buscarDentista(String cro) {

        for (int i = 0; i < dentistas.size(); i++) {

            Dentista existeNoVet = dentistas.get(i);

            if (existeNoVet.getCro().equals(cro)) {
                return existeNoVet;
            }
        }
        return null;
    }
    
    public void alterarDadosDentista(String cro, Dentista novosDados) {

        Dentista dentistaNoVet = buscarDentista(cro);

        if (dentistaNoVet == null) {
            System.out.println("dentista nao exitre");
            return;
        }

        dentistaNoVet.setNome(novosDados.getNome());
        dentistaNoVet.setCpf(novosDados.getCpf());
        dentistaNoVet.setTelefone(novosDados.getTelefone());
        dentistaNoVet.setEspecialidade(novosDados.getEspecialidade());
        dentistaNoVet.setSenha(novosDados.getSenha());

        System.out.println("novos dados colocados");
    }
    
    public void excluirDentista(String cro) {

        Dentista existeNoVet = buscarDentista(cro);

        if (existeNoVet == null) {
            System.out.println("dentista nao existe");
            return;
        }

        dentistas.remove(existeNoVet);

        System.out.println("Dentista excluido");
    }
    
    //metood usado pela secretaria
    public void listarDentistas() {

        if (dentistas.isEmpty()) {
            System.out.println("sem dentistas");
            return;
        }

        for (int i = 0; i < dentistas.size(); i++) {
        	Dentista dentista = dentistas.get(i);
        	
            System.out.println("-------dentistas cadastrados-------");
            System.out.println(dentista);
        }
    }
}
