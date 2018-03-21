/*
给定一个有序数组，你需要原地删除其中的重复内容，使每个元素只出现一次,并返回新的长度。
不要另外定义一个数组，您必须通过用 O(1) 额外内存原地修改输入的数组来做到这一点。
*/
package zone.lin.leetcodeCN.Y2018.M03.D16;
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
    	for(int i=1;i<nums.length;i++)
        {
        	if(nums[i]!=nums[i-1])
        	{
        		nums[j++]=nums[i];
        	}
        }
    	return j;
    }
}