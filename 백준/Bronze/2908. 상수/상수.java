import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int a = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(B).reverse().toString());

        System.out.println(Math.max(a,b));

        sc.close();
    }

}