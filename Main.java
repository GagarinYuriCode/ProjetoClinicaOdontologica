public class Main {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("João","99239809", "12345678900", 123);

		Dentista dentista = new Dentista("Murilo","98765432100", "27988888888", "12345", "cirurgia", "12345");

		ProcedimentoClinico procedimento = new ProcedimentoClinico(1, "arrancar dente","arrancar o siso", 40);

		Sala sala = new Sala(1, "sala de cirurgia");

		Agendamento agendamento = new Agendamento(1, paciente,dentista, 
				procedimento, sala, LocalDate.now(),LocalTime.of(9, 0));
		
		listaAgendamento gerencia = new listaAgendamento();

		gerencia.cadastrarAgendamento(agendamento);
		gerencia.listarAgendamentos();	

	}
}
