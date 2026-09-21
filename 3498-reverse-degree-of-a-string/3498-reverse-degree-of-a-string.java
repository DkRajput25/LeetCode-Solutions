class Solution {
    public int reverseDegree(String s) {
        //abc 
        int result = 0;
        
        for (int i= 0; i<=s.length()-1;i++){
            char ch = s.charAt(i);
            result += (122 - ch +1) * (i+1);
            
        }
        return result;
    }
}