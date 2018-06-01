/*给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
示例:
输入:
[1,2,3]
输出:
3
解释:
只需要3次移动（注意每次移动会增加两个元素的值）：
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]*/
package zone.lin.leetcodeCN.Y2018.M06.D01;
class Solution {
    public int minMoves(int[] nums) {
        if(nums.length<=1)
        	return 0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
        	min=min>nums[i]?nums[i]:min;
        	sum+=nums[i];
        }
        return sum-min*nums.length;
    }
}