/*给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
示例 1:
输入: [1,2,3]
输出: 6
示例 2:
输入: [1,2,3,4]
输出: 24
注意:
给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
输入的数组中任意三个数的乘积不会超出32位有符号整数的范围*/
//1.三个最大数相乘
//2.两个最小的负数和一个最大的正数
package zone.lin.leetcodeCN.Y2018.M07.D26;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
    	int len=nums.length;
        Arrays.sort(nums);
        int max=nums[len-1]*nums[len-2]*nums[len-3];
        int min=nums[0]*nums[1]*nums[len-1];
        return max>min?max:min;
    }
}
