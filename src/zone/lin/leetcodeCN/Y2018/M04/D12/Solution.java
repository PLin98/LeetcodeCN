//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
//函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。请注意，返回的下标值（index1 和 index2）不是从零开始的。
//你可以假设每个输入都只有一个解决方案，而且你不会重复使用相同的元素。
//输入：数组 = {2, 7, 11, 15}, 目标数 = 9
//输出：index1 = 1, index2 = 2
package zone.lin.leetcodeCN.Y2018.M04.D12;
class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int[] array = new int[2];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (target - numbers[i] == numbers[j]) {

					array[0] = i+1;
					array[1] = j+1;
					return array;
				}
			}
		}
		return array;
	}
}
