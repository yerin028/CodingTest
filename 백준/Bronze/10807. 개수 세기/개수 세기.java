import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num_list = new int[N];

        for (int i = 0; i < N; i++) {
            num_list[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            if (num_list[i] == k) {
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }

}