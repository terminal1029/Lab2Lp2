package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.pesos = new int[]{1, 1, 1, 1};
    }

    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numNotas];
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        double somaPonderada = 0;
        double somaPesos = 0;

        for (int i = 0; i < this.notas.length; i++) {
            somaPonderada += this.notas[i] * this.pesos[i];
            somaPesos += this.pesos[i];
        }

        double media = somaPonderada / somaPesos;
        return media >= 7.0;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.aprovado() + " " + Arrays.toString(this.notas);
    }
}