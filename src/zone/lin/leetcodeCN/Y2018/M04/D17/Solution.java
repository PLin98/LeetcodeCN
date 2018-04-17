//将包含 n 个元素的数组向右旋转 k 步。
//例如，如果  n = 7 ,  k = 3，给定数组  [1,2,3,4,5,6,7]  ，向右旋转后的结果为 [5,6,7,1,2,3,4]。
//注意:
//尽可能找到更多的解决方案，这里最少有三种不同的方法解决这个问题。
//提示:
//要求空间复杂度为 O(1)
package zone.lin.leetcodeCN.Y2018.M04.D17;
class Solution {
    public void rotate(int[] nums, int k) {
    	k=k%nums.length;
    	reverse(nums,0,nums.length-k-1);           
        reverse(nums,nums.length-k,nums.length-1);           
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] nums1,int s,int e)
	{
		for(;s<e;s++,e--)
		{
			int temp=nums1[e];
			nums1[e]=nums1[s];
			nums1[s]=temp;
		}
	}
}
//int temp;
//for(int i=0;i<k;i++)
//{
//	temp=nums[nums.length-1];
//	for(int j=0;j<nums.length;j++)
//	{
//		nums[j]=nums[j--];
//	}
//	nums[0]=temp;
//}