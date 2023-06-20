import java.time.LocalDate;

public class ExercicioSobrecarga {

    // Método para alterar apenas o ano da data
    public void mudarData(LocalDate data, int novoAno) {
        data = data.withYear(novoAno);
    }

    // Método para alterar o mês e o ano da data
    public void mudarData(LocalDate data, int novoMes, int novoAno) {
        data = data.withMonth(novoMes).withYear(novoAno);
    }

    // Método para alterar o dia, o mês e o ano da data
    public void mudarData(LocalDate data, int novoDia, int novoMes, int novoAno) {
        data = data.withDayOfMonth(novoDia).withMonth(novoMes).withYear(novoAno);
    }
}