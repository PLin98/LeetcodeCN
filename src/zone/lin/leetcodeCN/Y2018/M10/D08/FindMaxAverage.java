/*给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
示例 1:
输入: [1,12,-5,-6,50,3], k = 4
输出: 12.75
解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 
注意:
1 <= k <= n <= 30,000。
所给数据范围 [-10,000，10,000]。*/

package zone.lin.leetcodeCN.Y2018.M10.D08;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
    	double res=0;
    	int tmp=0;
    	for (int i = 0; i < nums.length; i++) {
			if(i<k) {//先将前k个数加起来
				tmp+=nums[i];
				res=tmp;
				continue;//跳出本次循环
			}
			tmp=tmp+nums[i]-nums[i-k];//添加一个后面的数,减掉第一个数
			if(tmp>res)
				res=tmp;
		}
    	
		return res/k;
    }
}