package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline = 0;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120; // Valor padrão citado nos testes
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return this.tempoInvestidoOnline >= this.tempoOnlineEsperado;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoOnlineEsperado;
    }
}