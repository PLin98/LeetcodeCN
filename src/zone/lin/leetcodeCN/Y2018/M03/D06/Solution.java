/*
  给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
package zone.lin.leetcodeCN.Y2018.M03.D06;

class Solution {

	public int[] twoSum(int[] nums, int target) {
		int[] array = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target - nums[i] == nums[j]) {

					array[0] = i;
					array[1] = j;
					return array;
				}
			}
		}
		return array;

	}

}
