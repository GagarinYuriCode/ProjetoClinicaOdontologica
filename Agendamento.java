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

    //constutoir
    public Agendamento(int codigo, Paciente paciente, Dentista dentista, Procedimento procedimento,
                       Sala sala, LocalDate data, LocalTime horarioInicio) {

        this.codigo = codigo;
        this.paciente = paciente;
        this.dentista = dentista;
        this.procedimento = procedimento;
        this.sala = sala;
        this.data = data;
        this.horarioInicio = horarioInicio;

        //soma ao horario inicial o tempo do procedimento na classe procedimento
        this.horarioFim = horarioInicio.plusMinutes(procedimento.getDuracao());
        this.status = StatusAgendamento.AGENDADA;
    }

    //----------metodos get pra pegar os dados pro agendamento--------------
    public int getCodigo() {
        return codigo;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public Sala getSala() {
        return sala;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public StatusAgendamento getStatus() {
        return status;
    }
    //------------------------------------------------------

    //a secretaria define o status do agendamento
    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }

    //-----------------metodos toString e equals----------------
    @Override
    public String toString() {
        return "agendamento: " + codigo
                + "\npaciente: " + paciente.getNome()
                + "\ndentista: " + dentista.getNome()
                + "\nprocedimento: " + procedimento.getNome()
                + "\nsala: " + sala.getNumero()
                + "\ndata: " + data
                + "\ninicio: " + horarioInicio
                + "\ntermino: " + horarioFim
                + "\nstatus: " + status;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        
        if (!(obj instanceof Agendamento)) { 
            return false;
        }
        
        Agendamento CastVerificar = (Agendamento) objeto;
        return codigo == CastVerificar.codigo;
    }
    //-----------------------------------------------------------------
}
