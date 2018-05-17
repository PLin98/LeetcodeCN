/*给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
注意：不要使用任何内置的库函数，如  sqrt。
示例 1：
输入： 16
输出： True
示例 2：
输入： 14
输出： False*/
package zone.lin.leetcodeCN.Y2018.M05.D17;
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0||num==1)
        	return true;
        for(int i=1;i<=num/2;i++)
        {
        	if(i*i==num)
        		return true;
        }
        return false;
    }
}