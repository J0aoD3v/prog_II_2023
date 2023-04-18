package capitulo_4;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }
    
    public Data(int ano) {
        this.dia = 1;
        this.mes = 1;
        this.ano = ano;
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String formatarData(char separador) {
        return this.dia + "" + separador + this.mes + "" + separador + this.ano;
    }    
}
