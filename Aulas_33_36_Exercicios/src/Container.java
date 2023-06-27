public class Container {
    private double capacidade;
    private boolean ocupado;

    public Container() {
        this.capacidade = 0.0;
        this.ocupado = false;
    }

    public Container(double capacidade, boolean ocupado) {
        this.capacidade = capacidade;
        this.ocupado = ocupado;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean ocupar(double medida) {
        if (medida <= capacidade && !ocupado) {
            ocupado = true;
            return true;
        } else {
            return false;
        }
    }
}
