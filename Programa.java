package teste;

public class Programa {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente("yuri",
				                         "12345678",
				                         "40028922",
				                          123);
		
		Dentista a = new Dentista("minecraft",
				                  "12345678",
				                  "32465457",
				                   "999",
				                   "dentes",
				                   "123");
		
		System.out.println(paciente.equals(a));
		System.out.println("\n"+paciente.toString());
		System.out.println("\n"+a.toString());

	}

}
