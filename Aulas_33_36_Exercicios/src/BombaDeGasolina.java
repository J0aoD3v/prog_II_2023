public class BombaDeGasolina {
    private int tanque;
    private double precoLitro;
    private int litrosVendidos;
    private double valorVendas;

    public BombaDeGasolina() {
        this.tanque = 5000;
        this.precoLitro = 5.20;
        this.litrosVendidos = 0;
        this.valorVendas = 0.0;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }

    public int getLitrosVendidos() {
        return litrosVendidos;
    }

    public void setLitrosVendidos(int litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void abastecerPorLitro(int quantidadeLitros) {
        if (quantidadeLitros <= tanque) {
            tanque -= quantidadeLitros;
            litrosVendidos += quantidadeLitros;
            valorVendas += quantidadeLitros * precoLitro;
        }
    }

    public void abastecerPorDinheiro(double valor) {
        int quantidadeLitros = (int) (valor / precoLitro);
        if (quantidadeLitros <= tanque) {
            tanque -= quantidadeLitros;
            litrosVendidos += quantidadeLitros;
            valorVendas += valor;
        }
    }

    public int status() {
        return tanque;
    }
}
