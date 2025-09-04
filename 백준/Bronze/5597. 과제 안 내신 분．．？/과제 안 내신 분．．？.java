import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] b = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            b[num] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 1; k <= 30; k++) {
            if (!b[k]) {
                sb.append(k).append("\n");
            }
        }
        System.out.print(sb);
    }

}