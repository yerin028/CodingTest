import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int position = -1;

        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;
                position = i + 1;
            }

        }
        System.out.println(max);
        System.out.println(position);

        sc.close();

    }

}