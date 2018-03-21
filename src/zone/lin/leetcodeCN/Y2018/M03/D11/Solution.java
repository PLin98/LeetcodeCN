/*
判断一个整数是否是回文数。不能使用辅助空间。
一些提示:
负整数可以是回文数吗？（例如 -1）
如果你打算把整数转为字符串，请注意不允许使用辅助空间的限制。
你也可以考虑将数字颠倒。但是如果你已经解决了 “颠倒整数” 问题的话，
就会注意到颠倒整数时可能会发生溢出。你怎么来解决这个问题呢？
*/
package zone.lin.leetcodeCN.Y2018.M03.D11;

class Solution {
    public boolean isPalindrome(int x) {
    	int Max=2147483647;
    	//int Min=-2147483648;
    	int result=0;
    	int temp=x;
    	if(temp<0)
    		return false;
    	if(temp<10)
    		return true;
    	while(temp!=0)
    	{
    		result=result*10+temp%10;
    		temp=temp/10;
    	}
    	if(result==x &&result<Max)
    		return true;
    	else
    		return false;
    }
}