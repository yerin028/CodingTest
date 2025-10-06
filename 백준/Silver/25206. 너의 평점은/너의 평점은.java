import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //학점x평점의 합
        double a = 0.0;
        //학점의 총합
        double b = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            if (grade.equals("P")) continue;

            double sum = 0.0;
            switch (grade) {
                case "A+": sum = 4.5; break;
                case "A0": sum = 4.0; break;
                case "B+": sum = 3.5; break;
                case "B0": sum = 3.0; break;
                case "C+": sum = 2.5; break;
                case "C0": sum = 2.0; break;
                case "D+": sum = 1.5; break;
                case "D0": sum = 1.0; break;
                case "F":  sum = 0.0; break;
            }

            a += score * sum; // (학점 × 평점)
            b += score;
        }
        System.out.printf("%.6f", a / b);
    }
}
