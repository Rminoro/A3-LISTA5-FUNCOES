import java.util.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {

       
        int count = 0;

        
        List<Integer> digits = new ArrayList<Integer>();

        Pattern p = Pattern.compile("\\d");

       
        Matcher m = p.matcher("3");

        while (m.find()) {

            count++;

            digits.add(new Integer(m.group()));
        }

        
        System.out.println(count);

        System.out.println(digits);

    }

}