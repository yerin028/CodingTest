import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int repeat = N/4;

        for (int i=0; i<repeat; i++){
            System.out.print("long ");
        }
        System.out.println("int");

        sc.close();
    }
}