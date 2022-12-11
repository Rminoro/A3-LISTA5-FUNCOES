import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // função que necessite argumento
        System.out.println("insira um argumento");
        Scanner S = new Scanner(System.in);

        Double num = S.nextDouble();

        String numero;
        // retornar "P" se for positivo
        // retornar "N" se for negativo
        {
            if (num > 0)
                System.out.println("P");
            else if (num <= 0)
                System.out.println("N");
        }

    }
}