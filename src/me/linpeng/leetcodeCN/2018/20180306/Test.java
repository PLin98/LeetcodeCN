package me.linpeng.leetcodeCN.Day180306;

public class Test {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 4 };
		int target = 6;
		int[] array = new int[2];
		Solution day = new Solution();
		array = day.twoSum(nums, target);
		System.out.println("(" + array[0] + "," + array[1] + ")");
	}

}
