/*
给定一个数组和一个值，就地移除该值的所有实例并返回新的长度。
不要为另一个数组分配额外空间，您必须通过在O（1）额外内存中就地修改输入数组来完成此操作。
元素的顺序可以改变。 无论你在新的长度以外留下什么都没有关系。
给定nums = [3,2,2,3]，val = 3，
你的函数应该返回length = 2，num的前两个元素是2
*/
package me.linpeng.leetcodeCN.Day180317;
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
    	for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]!=val)
        	{
        		nums[j++]=nums[i];
        	}
        }
    	return j;
    }
}