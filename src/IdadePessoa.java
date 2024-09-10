import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class IdadePessoa {
    private  String nome;
    private LocalDate dataNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void calculaIdade(){
      long diferencAnos = ChronoUnit.YEARS.between((Temporal) dataNascimento, LocalDate.now());
      if (diferencAnos >= 18){
          System.out.println( nome + " É  maior  de idade, ele(a) possui: " +diferencAnos + " Anos");

      }else {
          System.out.println(nome + " É menor de idade, ele(a) possui: " + diferencAnos + " Anos");
      }
    }

}
