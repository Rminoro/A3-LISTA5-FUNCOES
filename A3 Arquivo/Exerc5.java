import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(System.in);

        System.out.println("Digite a taxa de imposto: ");
        int taxaImposto = S.nextInt();

        System.out.println("Digite o custo: ");
        int custo = S.nextInt();

        Double somaImposto = (taxaImposto * 0.01 + custo);
        System.out.println(somaImposto + " valor de custo + impostos");

    }

}