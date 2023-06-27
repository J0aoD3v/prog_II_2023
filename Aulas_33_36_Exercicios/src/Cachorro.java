public class Cachorro {
    private String raca;
    private String nome;
    
    public Cachorro() {
        this.raca = "indeterminada";
        this.nome = "";
    }
    
    public Cachorro(String nome) {
        this.raca = "indeterminada";
        this.nome = nome;
    }
    
    public Cachorro(String raca, String nome) {
        this.raca = raca;
        this.nome = nome;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void latir() {
        System.out.println("auau");
    }
    
    public void latirRepetido(int vezes) {
        if (vezes < 0) {
            System.out.println("bugou");
        } else if (vezes > 100) {
            System.out.println("parâmetro inválido");
        } else {
            for (int i = 0; i < vezes; i++) {
                System.out.println("auau");
            }
        }
    }
}
