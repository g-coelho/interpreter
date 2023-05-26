package interpreter;

public class Casa {
    private double potencia;
    private double tempo;

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double calcularConta() {
        return Concessionaria.calcularConta(this.potencia, this.tempo);
    }
}
