/*
  给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
package me.linpeng.leetcodeCN;

public class Day180306 {
	public int[] twoSum(int[] nums, int target) {
		int[] array=new int[2];
		for(int i=0;i<4;i++)
		{
			for(int j=i;j<3-i;j++)
			{
				if(target-nums[i]==nums[j])
					array[0]=i;
					array[1]=j;	
			}
		}
		return array;
	}
	public static void main(String[] args)
	{
		int nums[]= {2,7,11,15};
		int target=9;
		int[] array=new int[2];
		Day180306 day=new Day180306();
		array=day.twoSum(nums,target);
		System.out.println("("+array[0]+","+array[1]+")");
	}
}
