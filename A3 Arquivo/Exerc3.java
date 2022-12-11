import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        double numero1 = S.nextDouble();

        System.out.println("Informe o segundo numero");
        double numero2 = S.nextDouble();

        System.out.println("Informe o terceiro numero");
        double numero3 = S.nextDouble();

        soma(numero1, numero2, numero3);

    }

    static void soma(double a, double b, double c) {
        System.out.println(a + b + c);
    }
}
