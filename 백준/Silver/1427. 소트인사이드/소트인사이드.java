import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        Character[] arr = new Character[n.length()];
        for (int i = 0; i < n.length(); i++) {
            arr[i] = n.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (char c : arr) {
            System.out.print(c);
        }

        sc.close();
    }
}