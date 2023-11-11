import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Summ2 {
    public static void main(String[] args) {
        String text = "A";
        Scanner scan = new Scanner("A");
        Pattern p = Pattern.compile("^\\D+$|\\.|-");
        Matcher m = p.matcher(text);
        int k = 0;
        while (m.find()) {
             scan = new Scanner(System.in);
             text = scan.nextLine();
             m = p.matcher(text);
        }
        k = Integer.parseInt(text);
        int n = 0;
        int summ = 0;
        for (int i = 0; summ < k; i++) {
            summ += i;
            n = i;
        }
        if (summ == k) {
            System.out.println("true");
            System.out.println(n);
        } else {
            System.out.println("false");
        }
    }
}