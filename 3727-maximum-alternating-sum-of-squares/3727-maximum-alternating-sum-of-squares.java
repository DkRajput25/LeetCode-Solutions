
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        long score = 0;
        int n = nums.length;
        long[] sq = new long[n];
        for(int k=0;k<n;k++){
            sq[k]= (long) nums[k] * nums[k];
        }

        Arrays.sort(sq);

        for (int i = 0; i < n; i++) {

            if (i < n  / 2) {
                score -= sq[i];
            } else {
                score += sq[i];
            }
        }

        return score;
    }
}
