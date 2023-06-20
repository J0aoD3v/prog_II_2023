import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
    public static String formatarData(LocalDate data) {
        // Define o formato da data desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Formata a data usando o formato definido
        return data.format(formatter);
    }

    public static void main(String[] args) {
        // Exemplo de uso do método formatarData()
        LocalDate dataAtual = LocalDate.now();
        
        // Chama o método formatarData() passando a data atual como argumento
        String dataFormatada = formatarData(dataAtual);
        
        // Exibe a data formatada no console
        System.out.println("Data formatada: " + dataFormatada);
    }
}