//实现 int sqrt(int x) 函数。
//计算并返回 x 的平方根。
//x 保证是一个非负整数。
//案例 1:
//输入: 4
//输出: 2
//案例 2:
//输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 由于我们想返回一个整数，小数部分将被舍去
package zone.lin.leetcodeCN.Y2018.M03.D25;
class Solution {
    public int mySqrt(int x) {
    	if(x==0||x==1)
    		return x;
        long low =1;
        long high=x/2+1;
        long tmp;
        long mid=0;
        while(low <= high)
        {
            mid = low + (high-low)/2;
            tmp = mid*mid;
            if(tmp<=x&&((mid+1)*(mid+1))>x) 
                return (int)mid;
            else if(tmp > x) 
                high=mid-1;
            else 
                low=mid+1;
        }
        return (int)mid;
    }
}