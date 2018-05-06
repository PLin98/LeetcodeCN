/*编写程序判断给定的数是否为丑数。
丑数就是只包含质因子 2, 3, 5 的正整数。例如， 6, 8 是丑数，而 14 不是，因为它包含了另外一个质因子 7。
注意：
1 也可以被当做丑数。
输入不会超过32位整数的范围。*/
package zone.lin.leetcodeCN.Y2018.M05.D06;
class Solution {
    public boolean isUgly(int num) {
        if(num<1)
        	return false;
        while(num%2==0)
        {
        	num=num/2;
        }
        while(num%3==0)
        {
        	num=num/3;
        }
        while(num%5==0)
        {
        	num=num/5;
        }
        if(num==1)
        	return true;
        return false;
    }
}