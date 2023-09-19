package ADO02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Fila {
    private Queue<Pacientes> filaNormal;
    private Queue<Pacientes> filaPreferencial;
    private Stack<Pacientes> pacientesAtendidos;

    public Fila() {
        filaNormal = new LinkedList<>();
        filaPreferencial = new LinkedList<>();
        pacientesAtendidos = new Stack<>();
    }

    public void adicionarPaciente(String nome, String tipoAtendimento) {
        Pacientes paciente = new Pacientes(nome, tipoAtendimento);
        if (tipoAtendimento.equalsIgnoreCase("preferencial")) {
            filaPreferencial.offer(paciente);
        } else {
            filaNormal.offer(paciente);
        }
    }

    public void chamarProximoPaciente() {
        if (!filaPreferencial.isEmpty()) {
            Pacientes paciente = filaPreferencial.poll();
            pacientesAtendidos.push(paciente);
            System.out.println("Chamando próximo paciente: " + paciente);
        } else if (!filaNormal.isEmpty()) {
            Pacientes paciente = filaNormal.poll();
            pacientesAtendidos.push(paciente);
            System.out.println("Chamando próximo paciente: " + paciente);
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }

    public Pacientes espiarProximoPaciente() {
        if (!filaPreferencial.isEmpty()) {
            return filaPreferencial.peek();
        } else if (!filaNormal.isEmpty()) {
            return filaNormal.peek();
        } else {
            return null;
        }
    }

    public void mostrarPacientesAtendidos() {
        System.out.println("Pacientes atendidos:");
        for (Pacientes paciente : pacientesAtendidos) {
            System.out.println(paciente);
        }
    }
}
