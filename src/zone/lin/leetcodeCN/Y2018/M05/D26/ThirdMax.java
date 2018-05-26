/*给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
示例 1:
输入: [3, 2, 1]
输出: 1
解释: 第三大的数是 1.
示例 2:
输入: [1, 2]
输出: 2
解释: 第三大的数不存在, 所以返回最大的数 2 .
示例 3:
输入: [2, 2, 3, 1]
输出: 1
解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
存在两个值为2的数，它们都排第二。*/
package zone.lin.leetcodeCN.Y2018.M05.D26;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
    	int result=Integer.MIN_VALUE, j=0;
        Arrays.sort(nums);//从大到小
        for(int i=nums.length-1; i>=0; i--)
        {
            if(result != nums[i])
            {
            	result = nums[i];
                j++;
                if(j == 3)
                    break;
            }
        }
        if(j<3)
            return nums[nums.length-1];
        return result;
    	
    }
}
/*Integer max=null;
Integer max_sec=null;
Integer max_thr=null;

for(int i=0;i<nums.length;i++)
{
	if(max==null||nums[i]>max)
	{
		max_thr=max_sec;
		max_sec=max;
		max=nums[i];
		
	}
	else if(max_sec==null||nums[i]>max_sec&&nums[i]<max)
	{
		max_thr=max_sec;
		max_sec=nums[i];
	}
	else if(max_thr==null||nums[i]>max_thr&&nums[i]<max_sec)
		max_thr=nums[i];	
}
return max_thr==null?max:max_thr;*/