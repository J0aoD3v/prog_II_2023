public class ClasseQuantidadeObjetos {
    private static int quantidadeObjetos; // Campo static para armazenar a quantidade de objetos

    public ClasseQuantidadeObjetos() {
        // Incrementa a quantidade de objetos toda vez que um objeto é instanciado
        quantidadeObjetos++;
    }

    public static void main(String[] args) {
        // Criação de objetos da classe
        ClasseQuantidadeObjetos objeto1 = new ClasseQuantidadeObjetos();
        ClasseQuantidadeObjetos objeto2 = new ClasseQuantidadeObjetos();
        ClasseQuantidadeObjetos objeto3 = new ClasseQuantidadeObjetos();

        // Exibe a quantidade de objetos existentes
        System.out.println("Quantidade de objetos: " + quantidadeObjetos);

        // Utilização das variáveis objeto1, objeto2 e objeto3
        System.out.println("Objeto 1: " + objeto1);
        System.out.println("Objeto 2: " + objeto2);
        System.out.println("Objeto 3: " + objeto3);
    }
}