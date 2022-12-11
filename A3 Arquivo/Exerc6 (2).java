import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner S = new Scanner(System.in);{

       System.out.println(" Digite uma data no formato de 24 horas:\n");
       String printDataConvertida = S.nextLine();{

    private String convertData24to12(String data) {
        String pattern24 = "dd-MM-yyyy hh:mm:ss";
        String pattern12 = "dd/MM/yyy hh:mm:ss";

        Locale local = new Locale("pt", "BR");
        SimpleDateFormat df = new SimpleDateFormat(pattern24, local);
        Date dataParseada = new Date();

        try {
            dataParseada = (df.parse(data));
            df.applyPattern(pattern12);
        } catch (Exception ex) {
            LOGGER.log(Level.INFO, "ERRO");

        }
        return df.format(dataParseada);

    }

    private void printDataConvertida(String data) {
        LOGGER.log(Level.INFO, data);
    }
}
