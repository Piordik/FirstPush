import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MidSquare2 {
    public static void main(String[] args) {
        String text = "A";
        Scanner scan = new Scanner("A");
        Pattern p = Pattern.compile("^\\D+$|\\.|-");
        Matcher m = p.matcher(text);
        int n = 0;
        while (m.find()) {
            scan = new Scanner(System.in);
            text = scan.nextLine();
            m = p.matcher(text);
        }
        double midsum = 0;
        n = Integer.parseInt(text);
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            scan = new Scanner(System.in);
            arr[i] = scan.nextDouble();
            midsum += arr[i];
        }
        midsum /= n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (Math.pow((arr[i] - midsum), 2));
        }
        double ans = Math.sqrt(sum / (n));
        String answ = String.format("%.3f", ans);
        System.out.println(answ);
    }
}