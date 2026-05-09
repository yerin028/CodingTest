class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        String target = board[h][w];
        
        int[] a = {-1, 1, 0, 0};
        int[] b = {0, 0, -1, 1};
        
        for (int i = 0; i < 4; i++) {
            int nh = h + a[i];
            int nw = w + b[i];
            
            if (nh >= 0 && nh < board.length && nw >= 0 && nw < board[0].length) {
                if (board[nh][nw].equals(target)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}