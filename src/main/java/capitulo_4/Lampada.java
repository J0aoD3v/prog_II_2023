
package capitulo_4;


class Lampada {
    boolean acesa; // atributo, campo, variável de instância
    
    //Construtor
    Lampada(){
        acesa = false; 
    }
    
    void ligar(){
        acesa = true;
    }
    
    void desligar(){
        acesa = false; 
    }
    
    String mostrarEstado(){
        if( acesa == true ){
            return "acesa";
        } 
        else {
            return "apagada"; 
        }
    }
    
    
}
