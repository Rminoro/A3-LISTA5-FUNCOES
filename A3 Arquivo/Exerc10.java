import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

public class Random1 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int dado = random.nextInt(12 - 2 + 1) + 2;

        while (true) {
            switch (dado) {
                case 7, 11:
                    System.out.println("Natural, ganhou!");
                    break;
                case 2, 3, 12:
                    System.out.println("Craps, perdeu!");
                    break;
                case 4, 5, 6, 8, 9, 10:
                    System.out.println("Ponto!");
                    break;
                default:
            }
            break;
        }
    }
}
