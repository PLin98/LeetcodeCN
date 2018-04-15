//给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//你可以假设数组是非空的，并且数组中的众数永远存在。
package zone.lin.leetcodeCN.Y2018.M04.D14;
class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
        	if(maj==nums[i])
        		count++;
        	else if(count>0)
        		count--;
        	else
        		maj=nums[i];
        }
        return maj;
    }
}
