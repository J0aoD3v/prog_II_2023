public class UtilVarargs {
    public static int calcular(String operacao, int... numeros) {
        int resultado = 0;
        
        if (operacao.equals("SOM")) {
            // Realiza a soma de todos os elementos
            for (int numero : numeros) {
                resultado += numero;
            }
        } else if (operacao.equals("MULT")) {
            // Realiza a multiplicação de todos os elementos
            resultado = 1; // Inicializa o resultado como 1 para a multiplicação
            
            for (int numero : numeros) {
                resultado *= numero;
            }
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        int soma = calcular("SOM", 2, 4, 6);
        System.out.println("Soma: " + soma);
        
        int multiplicacao = calcular("MULT", 3, 5, 2);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}