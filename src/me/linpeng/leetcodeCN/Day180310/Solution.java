/*
给定一个范围为 32 位 int 的整数，将其颠倒。假设我们的环境只能处理 32 位 int 范围内的整数。
根据这个假设，如果颠倒后的结果超过这个范围，则返回 0。
*/
package me.linpeng.leetcodeCN.Day180310;

class Solution {
    public int reverse(int x) {
    	int Max=214748364;
    	int Min=-2147483648;
    	int result=0;
    	int temp=x;
    	while(temp!=0)
    	{
    		result=result*10+temp%10;
    		temp=temp/10;
    	}
    	if(result>Max||result<Min)
    	{
    		return 0;
    	}
    	else
    		return result;
    }
}