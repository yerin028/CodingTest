import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int diagonal = 1;
        int sum = 0;

        while (sum + diagonal < x) {
            sum += diagonal;
            diagonal++;
        }

        int position = x - sum;

        int numerator, denominator;

        if (diagonal % 2 == 0) {
            numerator = position;
            denominator = diagonal - position + 1;
        } else {
            numerator = diagonal - position + 1;
            denominator = position;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
