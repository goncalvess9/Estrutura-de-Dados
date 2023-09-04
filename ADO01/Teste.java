package ADO01;

import java.util.Scanner;

public class Teste {
    public static void main(String [] args) {
    	Scanner scanner = new Scanner(System.in);
    	Futebol app = new Futebol(5);
    	
    	boolean continuar = true;
    	
    	 while (continuar) {
             System.out.println("\nEscolha uma opção: ");
             System.out.println("1 - Adicionar clube");
             System.out.println("2 - Listar clubes disponíveis");
             System.out.println("3 - Ver detalhes de um clube");
             System.out.println("4 - Excluir clube");
             System.out.println("5 - Sair");

             int opcao = app.scanner.nextInt();
             app.scanner.nextLine(); 

             if (opcao == 1) {
                 app.adicionarClube();
             } else if (opcao == 2) {
                 app.listarClubes();
             } else if (opcao == 3) {
                 System.out.println("Digite o número do clube que deseja ver:");
                 int indiceClube = app.scanner.nextInt() - 1;
                 app.scanner.nextLine(); 
                 app.exibirDetalhesClube(indiceClube);
             }else if (opcao == 4) {
            	 System.out.println("Digite o número do clube que você deseja excluir: ");
            	 int indiceExcluir = scanner.nextInt() - 1;
            	 scanner.nextLine();
            	 if (app.removerClube(indiceExcluir)) {
            		 System.out.println("Clube excluido com sucesso!");
            	 } else {
            		 System.out.println("Não foi possivel excluir o clube, verfique se o número esta correto.");
            	 }
             } else if (opcao == 5) {
                 continuar = false;
             } else {
                 System.out.println("Opção inválida. Tente novamente.");
             }
         }
    }
}
