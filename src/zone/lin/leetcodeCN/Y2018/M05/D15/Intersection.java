/*给定两个数组，写一个函数来计算它们的交集。
例子:给定 num1= [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].
提示:每个在结果中的元素必定是唯一的。
我们可以不考虑输出结果的顺序。*/
package zone.lin.leetcodeCN.Y2018.M05.D15;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	int n = Math.min(nums1.length, nums2.length);
        int[] is = new int[n];
        int count = 0;
        for(int i = 0; i < nums1.length; i++)
        {
        	int tmep = nums1[i];
        	for(int j = 0; j <nums2.length; j++)
        	{
        		if(tmep == nums2[j])
        		{
        			boolean exist = false;
			        for(int k = 0; k < count; k++)
			        {
			            if(is[k] == tmep)
			            {
			                exist = true;
			                break;
			            }
			        }
			        if(count >= n)
			        {
			            break;
			        }
			        if(!exist)
			        {
			            is[count] = tmep;
			            count++;
			        }
			        break;
        		}
        	}
        }
        int[] end = new int[count];
        for(int i = 0; i < count; i++)
        {
         end[i] = is[i];
        }
        return end; 
    }
}
