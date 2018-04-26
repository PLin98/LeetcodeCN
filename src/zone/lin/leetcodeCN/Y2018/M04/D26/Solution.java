//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使 nums [i] = nums [j]，
//并且 i 和 j 的绝对差值最大为 k。
package zone.lin.leetcodeCN.Y2018.M04.D26;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums.length==0)
            return false;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        	if(m.containsKey(nums[i]))
        	{
        		if(i-m.get(nums[i])<=k)
        			return true;
        		m.put(nums[i], i);
        	}
        	else
        		m.put(nums[i], i);
        }
        return false;
    }
}
/*
for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        		if(nums[i]==nums[j])
        		{
        			if(Math.abs(i-j)<=k)
        				return true;
        		}
        }
        	return false;
*/