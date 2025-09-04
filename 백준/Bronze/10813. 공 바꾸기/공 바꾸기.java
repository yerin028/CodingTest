import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //바구니 수
        int M = Integer.parseInt(st.nextToken()); //작업 수

        int[] a = new int[N + 1]; //바구니 배열

        //초기화 : 바구니 번호와 같은 공이 들어 있음
        for (int i = 0; i <= N; i++) {
            a[i] =i;
        }

        //M번 작업
        for (int b = 0; b < M; b++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 공 교환
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
        }

        StringBuilder sb = new StringBuilder();
        //모든 바구니를 차례대로 검사
        for (int i = 1; i <= N; i++) {
            sb.append(a[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

}