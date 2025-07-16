import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int array[] = new int[N];

        for (int i=0; i<N; i++) {
            array[i] = sc.nextInt();
        }

        int K = sc.nextInt();
        int count = 0;

        for (int i=0; i<N; i++) {
            if (array[i] == K) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }


}