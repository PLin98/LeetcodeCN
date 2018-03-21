/*
给定一个范围为 32 位 int 的整数，将其颠倒。
假设我们的环境只能处理 32 位 int 范围内的整数。根据这个假设，如果颠倒后的结果超过这个范围，则返回 0。
*/
package zone.lin.leetcodeCN.Y2018.M03.D10;
class Solution {
    public int reverse(int x) {
    	long Max=2147483647;
    	long Min=-2147483648;
    	long result=0;
    	long temp=x;
    	int a=0;
    	if(temp>Max||temp<Min)
    		return a;
    	else
    	{
	    	while(temp!=0)
	    	{
	    		result=result*10+temp%10;
	    		temp=temp/10;
	    	}
	    	if(result>Max||result<Min)
	    		return a;
	    	else
	    		return (int)result;
    	}
    }
}