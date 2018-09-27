/*给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
示例1:
输入: 5
输出: True

解释: 1 * 1 + 2 * 2 = 5
示例2:
输入: 3
输出: False*/
package zone.lin.leetcodeCN.Y2018.M09.D27;

class Solution {
    public boolean judgeSquareSum(int c) {
    	for(long i=0;i*i<=c;i++)
    	{
    		double x=Math.sqrt(c-i*i);
    		if(x== Double.valueOf(x).intValue())//intValue() 表示将某类型转成整数
    			return true;
    			
    	}
		return false;  
    }
}