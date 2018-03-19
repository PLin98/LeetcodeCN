/*
给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
你可以假设在数组中无重复元素。
案例 1:
输入: [1,3,5,6], 5
输出: 2
案例 2:
输入: [1,3,5,6], 2
输出: 1
案例 3:
输入: [1,3,5,6], 7
输出: 4
案例 4:
输入: [1,3,5,6], 0
输出: 0
*/
package me.linpeng.leetcodeCN.Day180319;
class Solution {
    public int searchInsert(int[] nums, int target) {
    	int low=0,high=nums.length-1,mid;
    	while(low<=high)
    	{
    		mid=(low+high)/2;
    		if(target==nums[mid])
    			return mid;
    		else
    			if(target<nums[mid])
    				high=mid-1;
    			else
    				low=mid+1;
    	}
    	return low;
    }
}