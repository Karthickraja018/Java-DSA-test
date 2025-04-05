import java.util.*;
public class LDS {
    public static int LDSLength(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(nums[i]<nums[j]&&dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        int max=0;
        for(int num:dp){
            max = Math.max(max, num);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,1,6,4};
        int result = LDSLength(arr);
        System.out.println(result);
    }
}
