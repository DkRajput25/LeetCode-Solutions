class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int result=0;
        for(int x:nums){
            result+=x;
        }
        return sum-result;
    }
}