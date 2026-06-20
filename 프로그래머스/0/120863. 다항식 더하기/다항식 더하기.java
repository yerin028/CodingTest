class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        
        int a = 0; 
        int b = 0; 
        
        for (String s : arr) {
            if (s.contains("x")) {
                if (s.equals("x")) {
                    a += 1;
                } else {
                    a += Integer.parseInt(s.replace("x", ""));
                }
            } else {
                b += Integer.parseInt(s);
            }
        }
        
        if (a == 0) return String.valueOf(b);
        if (b == 0) return a == 1 ? "x" : a + "x";
        
        return a == 1 ? "x + " + b : a + "x + " + b;
    }
}