package ADO01;

import java.util.Scanner;

public class Futebol  {
    public Vetor vetor;
    public Scanner scanner;
    
    public Futebol (int tamanho) {
    	vetor = new Vetor(tamanho);
    	scanner = new Scanner (System.in);
    }
    
    public void adicionarClube() {
        System.out.println("Digite o nome do clube:");
        String nome = scanner.nextLine();

        System.out.println("Digite a cidade do clube: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite o número de títulos do Brasileirão: ");
        int titulosBrasileirao = scanner.nextInt();

        System.out.println("Digite o número de títulos da Copa do Brasil: ");
        int titulosCopaDoBrasil = scanner.nextInt();

        System.out.println("Digite o número de títulos da Libertadores: ");
        int titulosLibertadores = scanner.nextInt();
        scanner.nextLine(); 

        Clube clube = new Clube(nome, cidade, titulosBrasileirao, titulosCopaDoBrasil, titulosLibertadores);
        vetor.adicionarClube(clube);
    }
    
    public boolean removerClube(int indice) {
        return vetor.removerClube(indice);
    }
    
    public void listarClubes() {
    	vetor.listarClubes();
    }
    
    public void exibirDetalhesClube(int indice) {
        Clube clube = vetor.getClube(indice);
        if (clube != null) {
            System.out.println("Detalhes do Clube: ");
            System.out.println(clube);
        } else {
            System.out.println("Índice de clube inválido.");
        }
    }
    
    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Adicionar clube");
            System.out.println("2 - Listar clubes disponíveis");
            System.out.println("3 - Ver detalhes de um clube");
            System.out.println("4 - Excluir clube");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                adicionarClube();
            } else if (opcao == 2) {
                listarClubes();
            } else if (opcao == 3) {
                System.out.println("Digite o número do clube que deseja ver: ");
                int indiceClube = scanner.nextInt() - 1;
                scanner.nextLine(); 
                exibirDetalhesClube(indiceClube);
            }else if (opcao == 4) {
            	System.out.println("Digite o número do clube que você deseja excluir: ");
            	int indiceExcluir = scanner.nextInt() - 1;
            	scanner.nextLine();
            	if (removerClube(indiceExcluir)) {
            		System.out.println("Clube excluido com sucesso!");
            	} else {
            		System.out.println("Não foi possivel excluir esse clube, verifique se as informações que você passou estão corretas.");
            	}
            } else if (opcao == 5) {
                continuar = false;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
