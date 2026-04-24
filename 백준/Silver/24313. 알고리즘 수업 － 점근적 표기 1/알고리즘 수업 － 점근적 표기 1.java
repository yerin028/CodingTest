import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if (a <= c && a * n0 + b <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}