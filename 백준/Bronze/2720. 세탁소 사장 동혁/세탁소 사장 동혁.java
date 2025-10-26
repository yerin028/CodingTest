import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(a/q+ " ");
            a %= q;
            sb.append(a/d+ " ");
            a %=d;
            sb.append(a/n+ " ");
            a %= n;
            sb.append(a/p+ "\n");
        }
        System.out.println(sb);
    }
}
