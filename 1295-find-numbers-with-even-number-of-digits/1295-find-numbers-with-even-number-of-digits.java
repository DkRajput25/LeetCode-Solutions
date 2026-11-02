class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums){
            int count=0;
            while(num>0){
                int x = num%10;
                num=num/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        
        
        return even;
    }
}