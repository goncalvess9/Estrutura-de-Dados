package ADO01;

public class Vetor {
    private Clube[] clubes;
    private int numClubes;
    private int tamanhoMaximo;
    
    public Vetor (int tamanhoMaximo) {
    	this.tamanhoMaximo = tamanhoMaximo;
    	clubes = new Clube [tamanhoMaximo];
    	numClubes = 0;
    }
    
    public void adicionarClube (Clube clube) {
    	if (numClubes < tamanhoMaximo) {
    		clubes[numClubes] = clube;
    		numClubes++;
    	} else {
    		System.out.println("A lista de clubes já esta cheia!");
    	}
    }
    
    public boolean removerClube(int indice) {
        if (indice >= 0 && indice < numClubes) {
            for (int i = indice; i < numClubes - 1; i++) {
                clubes[i] = clubes[i + 1];
            }
            clubes[numClubes - 1] = null; 
            numClubes--;
            return true; 
        } else {
            return false; 
        }
    }
    
    public void listarClubes() {
    	System.out.println("Times disponiveis: ");
    	for (int i = 0; i < numClubes; i++) {
    		System.out.println((i + 1) + "." + clubes[i].getNome());
    	}
    }
    
    public Clube getClube (int indice) {
    	if (indice <= 0 && indice < numClubes) {
    		return clubes [indice];
    	} else {
    		return null;
    	}
    }
}
