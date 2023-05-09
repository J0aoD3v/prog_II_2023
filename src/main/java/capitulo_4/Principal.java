package capitulo_4;
//import java.util.Scanner;

public class Principal {
    public static void main(String[] x) {
        //Lampada.java
        //Scanner scan = new Scanner(System.in);
        boolean estado = true;
        int fim = 0; 
        while(fim < 15){
        Lampada lampada = new Lampada(estado); 
        System.out.println(lampada.mostrarEstado());
        lampada.setEstado(false);
        System.out.println(lampada.mostrarEstado());
        lampada. setEstado(true);      
        String retorno = lampada.mostrarEstado();
        System.out.println(retorno);
        fim++;
        if(fim % 2 != 0){
            System.out.println("chegamos na rodada impar " + fim);
        }
        }
        System.out.println(" ");

        //Caixa.java
        Caixa minhaCaixa = new Caixa(10, 5, 3);
        double volumeDaCaixa = minhaCaixa.calcularVolume();
        System.out.println("O volume da caixa é: " + volumeDaCaixa);
        System.out.println(" ");

        //Data.java
        Data data1 = new Data();
        Data data2 = new Data(2021);
        Data data3 = new Data(18, 4, 2023);
    
        System.out.println(data1.formatarData('/')); // Saída: 1/1/1900
        System.out.println(data2.formatarData('-')); // Saída: 1-1-2021
        System.out.println(data3.formatarData('.')); // Saída: 18.4.2023
    }

}

