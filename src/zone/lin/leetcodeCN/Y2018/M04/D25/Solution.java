//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数应该返回 true。
//如果每个元素都不相同，则返回 false。
package zone.lin.leetcodeCN.Y2018.M04.D25;

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if(nums.length==0)
            return false;
    	Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}

/*
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if(nums.length==0)
            return false;
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        		if(nums[i]==nums[j])
        			return true;
        }
        	return false;
    }
}
*/