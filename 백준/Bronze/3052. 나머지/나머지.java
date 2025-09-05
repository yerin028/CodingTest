import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] b = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            b[num%42] = true;
        }

        int count = 0;
        for (int k = 0; k < 42; k++){
            if (b[k]) count++;
        }

        System.out.println(count);
    }

}