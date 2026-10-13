package lab2;

import java.util.Arrays;

public class RegistroResumos {
    private int limiteResumos;
    private String[] temas;
    private String[] conteudos;
    private int quantidadeAtual = 0;

    public RegistroResumos(int numeroDeResumos) {
        this.limiteResumos = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
    }

    public void adicionaResumo(String tema, String conteudo) {
        if (this.quantidadeAtual >= this.limiteResumos) {
            for (int i = 0; i < this.limiteResumos - 1; i++) {
                this.temas[i] = this.temas[i + 1];
                this.conteudos[i] = this.conteudos[i + 1];
            }
            this.quantidadeAtual = this.limiteResumos - 1;
        }
        this.temas[this.quantidadeAtual] = tema;
        this.conteudos[this.quantidadeAtual] = conteudo;
        this.quantidadeAtual++;
    }

    public String[] pegaResumos() {
        String[] resumosAtuais = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resumosAtuais[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resumosAtuais;
    }

    public String imprimeResumos() {
        String resultado = "Resumos:\n";
        resultado += " - " + this.quantidadeAtual + " resumo(s) cadastrado(s)\n";
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resultado += " - " + this.temas[i] + " | " + this.conteudos[i];
            if (i < this.quantidadeAtual - 1) {
                resultado += "\n";
            }
        }
        return resultado;
    }

    public int contaResumos() {
        return this.quantidadeAtual;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.temas[i].equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        int contadorEncontrados = 0;
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.conteudos[i].toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                contadorEncontrados++;
            }
        }

        String[] resultados = new String[contadorEncontrados];
        int indice = 0;
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.conteudos[i].toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                resultados[indice] = this.temas[i];
                indice++;
            }
        }

        Arrays.sort(resultados);
        return resultados;
    }
}