class Solution {
    public int solution(int[][] dots) {
        int a = Math.abs(dots[0][0] - dots[1][0]);
        int b = Math.abs(dots[0][1] - dots[2][1]);
        
        if (a == 0 ) {
            a = Math.abs(dots[0][0] - dots[2][0]);
        }
        
        if (b == 0) {
            b = Math.abs(dots[0][1] - dots[1][1]);
        }
        
        return a * b;
    }
}