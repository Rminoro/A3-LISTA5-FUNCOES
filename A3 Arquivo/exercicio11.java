import java.util.Scanner;

public class exercicio11 {
    public static String ldata(String dat, String[] ext) {
        StringBuilder saida = new StringBuilder();

        ext = dat.split("/");

        for (int x = 0; x < 3; x++) {
            if (x == 0) {
                saida.append(ext[x]);
                saida.append(" de ");
            }

            if (x == 1) {
                if (ext[x].compareTo("01") == 0) {
                    saida.append("Janeiro");
                } else if (ext[x].compareTo("02") == 0) {
                    saida.append("Fevereiro");
                } else if (ext[x].compareTo("03") == 0) {
                    saida.append("Março");
                } else if (ext[x].compareTo("04") == 0) {
                    saida.append("Abril");
                } else if (ext[x].compareTo("05") == 0) {
                    saida.append("Maio");
                } else if (ext[x].compareTo("06") == 0) {
                    saida.append("Junho");
                } else if (ext[x].compareTo("07") == 0) {
                    saida.append("Julho");
                } else if (ext[x].compareTo("08") == 0) {
                    saida.append("Agosto");
                } else if (ext[x].compareTo("09") == 0) {
                    saida.append("Setembro");
                } else if (ext[x].compareTo("10") == 0) {
                    saida.append("Outubro");
                } else if (ext[x].compareTo("11") == 0) {
                    saida.append("Novembro");
                } else if (ext[x].compareTo("12") == 0) {
                    saida.append("Dezembro");
                } else {
                    saida.append(ext[x]);
                }

                saida.append(" de ");
            }

            if (x == 2) {
                saida.append(ext[x]);
            }
        }

        return saida.toString();

    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String[] descrito = new String[3];
        String data = "";

        do {
            System.out.print("Digite a data em formato dd/mm/aaaa: ");
            data = S.nextLine();

            if (data.length() != 10) {
                System.out.println("Data Inválida!");
            }
        } while (data.length() != 10);
        S.close();
        System.out.println(ldata(data, descrito));
    }

}