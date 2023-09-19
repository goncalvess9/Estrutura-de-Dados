package ADO02;

class Pacientes {
    private String nome;
    private String tipoAtendimento;

    public Pacientes(String nome, String tipoAtendimento) {
        this.nome = nome;
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + " - Tipo de Atendimento: " + tipoAtendimento;
    }
}
