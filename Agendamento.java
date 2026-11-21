package teste;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {
    //atributos de agendamento 
    private int codigo;
    private Paciente paciente;
    private Dentista dentista;
     private Procedimento procedimento;
    private Sala sala;
    private LocalDate data;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private StatusAgendamento status;

    
