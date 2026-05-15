class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        
        int x = 0;
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                continue;
            }
            
            if (arr[i].contains("x")) {
                if (arr[i].equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(arr[i].replace("x", ""));
                }
            } else {
                num += Integer.parseInt(arr[i]);
            }
        }
        
        String answer = "";
        
        if (x > 0) {
            if (x == 1) {
                answer += "x";
            } else {
                answer += x + "x";
            }
        }
        
        if (num > 0) {
            if (!answer.equals("")) {
                answer += " + ";
            }
            answer += num;
        }
        
        return answer;
    }
}