public class Ponto {
    private int x;
    private int y;
    
    // Construtor parametrizado
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Construtor vazio
    public Ponto() {
        // Não faz nada, os campos x e y são inicializados com valores padrão (0 para int)
    }
    
    // Método get para o campo x
    public int getX() {
        return x;
    }
    
    // Método set para o campo x
    public void setX(int x) {
        this.x = x;
    }
    
    // Método get para o campo y
    public int getY() {
        return y;
    }
    
    // Método set para o campo y
    public void setY(int y) {
        this.y = y;
    }
}