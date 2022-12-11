import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String reverso = "";

        System.out.println("Digite um número");
        String numero = scan.next();

        for (int i = (numero.length() - 1); i >= 0; i--) {
            reverso += numero.charAt(i);
        }

        System.out.println("o reverso do número é: " + reverso);

    }
}