package teste;

import gerencia.*;
import java.time.LocalDate;
import java.time.LocalTime;
import classes.*;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ControlePaciente controlePaciente= new ControlePaciente();
		
		int opcao;
		
		do {
			System.out.println("\n---------SECRETARIA-------------");
			System.out.println("1 - cadastrar paciente");
			System.out.println("2 - consultar pacientes");
			System.out.println("3 - alterar dados do paciente");
			System.out.println("4 - consultar procedimentos");
			System.out.println("5 - consultar dentistas");
			System.out.println("6 - realizar agendamento");
			System.out.println("7 - consultar agendamentos");
			System.out.println("8 - cancelar agendamento");
			System.out.println("9 - remarcar agendamento");
			System.out.println("0 - sair");
			
			System.out.print("\nescolha uma opcao: ");
			opcao = entrada.nextInt();	
			
			switch(opcao) {
			
			    case 1:
			    	System.out.print("\ncodigo: ");
			    	int codigo = entrada.nextInt();

			    	entrada.nextLine();
			    	
			    	System.out.print("\nnome: ");
			    	String nome = entrada.nextLine();

			    	System.out.print("\nCPF: ");
			    	String cpf = entrada.nextLine();

			    	System.out.print("\ntelefone: ");
			    	String telefone = entrada.nextLine();

			    	Paciente paciente = new Paciente(nome, cpf, telefone, codigo);
			    	controlePaciente.cadastrarPaciente(paciente);
			    	break;
                
			    case 2:
			    	controlePaciente.consultarPacientes();
			    	break;
			    	
			    case 3:

					
			    case 0:
			    	System.out.println("fim");
			    	break;

			    default:
			    	System.out.println("\nopcao invalida");
				}
			
		} while (!(opcao == 0));
