public class Main { //Main1

    public static void main(String[] args) {
        final int three = 3;
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c = Integer.valueOf(args[2]);
        int d = Integer.valueOf(args[three]);
        c *= b;
        b *= d;
        a = a * d + c;
        final int ten = 10;
        for (int i = 1; i < ten; ++i) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}