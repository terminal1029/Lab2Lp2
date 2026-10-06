package lab2;

public class Descanso {
    private int horasDescanso = 0;
    private int numeroSemanas = 1;

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        int media = this.horasDescanso / this.numeroSemanas;
        if (media >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}