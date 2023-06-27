public class Util {
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean ehNegativo(int numero) {
        return numero < 0;
    }

    public static double maior(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }
    public static int encontrarMaior(int... numeros) {
        if (numeros.length == 0) {
            return 0; // Valor padrão quando nenhum número é fornecido
        }

        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }
}
