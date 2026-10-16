class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }
        for(int i=0;i<t.length();i++){
            int index = t.charAt(i) - 'a';
            arr[index]--;
        }
        for(int x:arr){
            if(x>0){
                return false;
            }
        }
        
        return true;
    }
}