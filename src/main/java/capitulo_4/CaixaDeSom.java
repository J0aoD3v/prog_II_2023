
package capitulo_4;


class CaixaDeSom {
    Integer volume;     // atributos, campos
    String cor; 
    Boolean ligada;
    
    //Construtor 
    CaixaDeSom(){
        volume = 0; 
        cor = ""; 
        ligada = false;      
    }
    
    void ligar(){       // método --> parte do código que executa ações
        ligada = true; 
    }
    
    void desligar(){
        ligada = false; 
        volume=0; 
    }
    
    void aumentarVolume(int novoVolume){
        if(novoVolume < 10){
            volume = 10;
            return; 
        }
        volume = novoVolume; 
    }
    
    void aumentarVolume(){
        if(volume==10){
            return; 
        }
        volume++; 
    }
    
    void diminuirVolume(){
        if(volume == 0){
            return; 
        }
        volume--; 
    }
    
    
    
    
}
