public class Robo {
    private String nome;
    private Ponto posicao;
    
    // Construtor parametrizado
    public Robo(String nome, Ponto posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }
    
    // Construtor vazio
    public Robo() {
        this.nome = ""; // Inicializa o nome com uma string vazia
        // Não faz nada, o campo posicao é inicializado com valor padrão (null para Ponto)
    }
    
    // Métodos getters e setters para o campo nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Método para o robô andar para a direita (incrementando o valor de x)
    public void andarDireita() {
        posicao.setX(posicao.getX() + 1);
    }
    
    // Método para o robô andar para a esquerda (decrementando o valor de x)
    public void andarEsquerda() {
        posicao.setX(posicao.getX() - 1);
    }
    
    // Método para o robô andar para baixo (decrementando o valor de y)
    public void andarBaixo() {
        posicao.setY(posicao.getY() - 1);
    }
    
    // Método para o robô andar para cima (incrementando o valor de y)
    public void andarCima() {
        posicao.setY(posicao.getY() + 1);
    }
    
    // Método para o robô se teletransportar para uma coordenada específica
    public void teletransportar(Ponto novaPosicao) {
        posicao = novaPosicao;
    }
    
    // Método para obter a posição atual do robô
    public Ponto obterPosicao() {
        return posicao;
    }
    
    // Verifica se o robô colidiu com outro robô
    public boolean colidiu(Robo outroRobo) {
        // Obtém a posição do outro robô
        Ponto posicaoOutroRobo = outroRobo.obterPosicao();
        
        // Compara a posição atual do robô atual com a posição do outro robô
        return posicao.equals(posicaoOutroRobo);
    }
}