class Solution {
    public double solution(int[] arr) {
        int a = 0;
        
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        
        return (double) a / arr.length;
    }
}