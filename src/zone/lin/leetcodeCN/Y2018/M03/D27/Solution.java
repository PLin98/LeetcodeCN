//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1中，使得 num1 成为一个有序数组。
//注意:
//你可以假设 nums1有足够的空间（空间大小大于或等于m + n）来保存 nums2 中的元素。在 nums1 和 nums2 中初始化的元素的数量分别是 m 和 n。
package zone.lin.leetcodeCN.Y2018.M03.D27;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=n+m-1;
        int a=m-1,b=n-1;
    	while(a>=0&&b>=0)
    	{
    		if(nums1[a]<=nums2[b])
    			nums1[i--]=nums2[b--];
    		else
    			nums1[i--]=nums1[a--];
    	}
    	while(b>=0)
    		nums1[i--]=nums2[b--];
    	while(a>=0)
    		nums1[i--]=nums1[a--];
    }
}