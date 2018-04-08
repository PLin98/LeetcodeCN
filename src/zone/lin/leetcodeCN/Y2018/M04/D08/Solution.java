//给定一个整数数组，除了某个元素外其余元素均出现两次。请找出这个只出现一次的元素。
package zone.lin.leetcodeCN.Y2018.M04.D08;
class Solution {
    public int singleNumber(int[] nums) {
       int i,flag=0;
       for(i=0;i<nums.length;i++)
    	   flag=flag^nums[i];
       return flag;
    }
}