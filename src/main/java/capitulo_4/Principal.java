package capitulo_4;

public class Principal {

    public static void main(String[] x) {
        Lampada lampada = new Lampada(); 
        System.out.println(lampada.mostrarEstado());
        lampada.ligar();
        System.out.println(lampada.mostrarEstado());
        lampada.desligar();        
        String retorno = lampada.mostrarEstado();
        System.out.println(retorno);
       
    }

}

