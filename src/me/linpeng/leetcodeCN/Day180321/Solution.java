/*
给定一个序列（至少含有 1 个数），从该序列中寻找一个连续的子序列，使得子序列的和最大。
例如，给定序列 [-2,1,-3,4,-1,2,1,-5,4]，
连续子序列 [4,-1,2,1] 的和最大，为 6。
*/
package me.linpeng.leetcodeCN.Day180321;
class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum=nums[0];
        int sum=0;
        /*for(int i=0;i<nums.length;i++)
        {
        	sum=0;
        	for(int j=i;j<nums.length;j++)
        	{
        		sum+=nums[j];
        		if(sum>=Maxsum)
        			Maxsum=sum;
        	}
        }
        */
        for(int i=0;i<nums.length;i++)
        {
        	sum+=nums[i];
        	if(sum>Maxsum)
        		Maxsum=sum;
        	if(sum<0)
        		sum=0;
        }
        return Maxsum;
    }
}
