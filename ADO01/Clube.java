package ADO01;

public class Clube {
	private String nome;
    private String cidade;
    private int titulosBrasileirao;
    private int titulosCopaDoBrasil;
    private int titulosLibertadores;

    public Clube(String nome, String cidade, int titulosBrasileirao, int titulosCopaDoBrasil, int titulosLibertadores) {
        this.nome = nome;
        this.cidade = cidade;
        this.titulosBrasileirao = titulosBrasileirao;
        this.titulosCopaDoBrasil = titulosCopaDoBrasil;
        this.titulosLibertadores = titulosLibertadores;
   }
    
    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getTitulosBrasileirao() {
        return titulosBrasileirao;
    }

    public int getTitulosCopaDoBrasil() {
        return titulosCopaDoBrasil;
    }

    public int getTitulosLibertadores() {
        return titulosLibertadores;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Cidade: " + cidade + "\n" +
               "Títulos Brasileirão: " + titulosBrasileirao + "\n" +
               "Títulos Copa do Brasil: " + titulosCopaDoBrasil + "\n" +
               "Títulos Libertadores: " + titulosLibertadores;
    }
}