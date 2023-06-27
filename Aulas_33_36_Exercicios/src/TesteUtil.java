public class TesteUtil {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;
        System.out.println(numero1 + " é par? " + Util.ehPar(numero1));
        System.out.println(numero2 + " é par? " + Util.ehPar(numero2));

        int numero3 = -3;
        int numero4 = 8;
        System.out.println(numero3 + " é negativo? " + Util.ehNegativo(numero3));
        System.out.println(numero4 + " é negativo? " + Util.ehNegativo(numero4));

        double numero5 = 7.5;
        double numero6 = 10.2;
        double maiorNumero = Util.maior(numero5, numero6);
        System.out.println("O maior número entre " + numero5 + " e " + numero6 + " é: " + maiorNumero);

        int maior = Util.encontrarMaior(5, 2, 8, 1, 10);
        System.out.println("O maior número é: " + maior);
    }
}
