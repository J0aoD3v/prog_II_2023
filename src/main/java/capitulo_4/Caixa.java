package capitulo_4;

public class Caixa {
    private double largura;
    private double altura;
    private double profundidade;

    public Caixa(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public double calcularVolume() {
        double volume = this.largura * this.altura * this.profundidade;
        return volume;
    }
}
