import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class exercicio12 {
    public static String embaralhaPalavra(List<String> embaralharpalavra, String palavraescrita) {
        Collections.shuffle(embaralharpalavra);
        StringBuilder saida = new StringBuilder(palavraescrita.length());

        saida.append("A palavra digitada quando embaralhada fica : ");

        for (String a : embaralharpalavra) {
            saida.append(a);
        }

        return saida.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        List<String> embaralhar = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(embaralhar, palavra));
        sc.close();
    }
}