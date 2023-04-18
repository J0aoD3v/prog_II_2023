
package capitulo_4;


class Lampada {
    private boolean acesa; // atributo, campo, variável de instância
    
    //Construtor
    Lampada(boolean estado ){
        this.acesa = estado; 
    }
    
   public String mostrarEstado(){
        if( acesa == true ){
            return "acesa";
        } 
        else {
            return "apagada"; 
        }
    }

    public boolean getEstado(){
     return this.acesa;
    }

    public void setEstado(boolean estado){
      this.acesa= estado;
    }
    
    
}
