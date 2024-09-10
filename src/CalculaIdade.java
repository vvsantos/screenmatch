import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculaIdade {
    public static void main(String[] args) {
        IdadePessoa maiorDeIdade = new IdadePessoa();
        String dataString = "13/08/2010";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataString, formato);
        maiorDeIdade.setNome("Vergilio Santos");
        maiorDeIdade.setDataNascimento(data);
        maiorDeIdade.calculaIdade();
    }
}
