package ADO02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Fila filaAtendimento = new Fila();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar paciente à fila");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("3 - Espiar próximo paciente");
            System.out.println("4 - Mostrar pacientes atendidos");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome do paciente: ");
                String nome = scanner.nextLine();
                System.out.print("Tipo de atendimento (normal/preferencial): ");
                String tipoAtendimento = scanner.nextLine();
                filaAtendimento.adicionarPaciente(nome, tipoAtendimento);
            } else if (opcao == 2) {
                filaAtendimento.chamarProximoPaciente();
            } else if (opcao == 3) {
                Pacientes proximoPaciente = filaAtendimento.espiarProximoPaciente();
                if (proximoPaciente != null) {
                    System.out.println("Próximo paciente na fila: " + proximoPaciente);
                } else {
                    System.out.println("Não há pacientes na fila.");
                }
            } else if (opcao == 4) {
                filaAtendimento.mostrarPacientesAtendidos();
            } else if (opcao == 5) {
                System.out.println("Saindo do programa.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 5);
    }
}
