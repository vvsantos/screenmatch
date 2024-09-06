import br.com.alura.screenmathc.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8  );
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total das Avalições: " meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.totalAvaliacoes);

        System.out.println(meuFilme.pegamedia());


    }
}
