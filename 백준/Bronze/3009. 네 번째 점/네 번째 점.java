import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int targetX;
        int targetY;

        if (x[0] == x[1]) {
            targetX = x[2];
        } else if (x[0] == x[2]) {
            targetX = x[1];
        } else  {
            targetX = x[0];
        }

        if (y[0] == y[1]) {
            targetY = y[2];
        } else if (y[0] == y[2]) {
            targetY = y[1];
        } else  {
            targetY = y[0];
        }

        System.out.println(targetX + " " + targetY);

        sc.close();
    }
}
