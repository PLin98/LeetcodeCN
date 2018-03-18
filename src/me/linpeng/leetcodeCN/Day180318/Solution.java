/*
实现strStr（）。
在干草堆中返回第一针出现的指数，如果针不是干草堆的一部分，则返回-1。
例1：
输入：haystack =“hello”，needle =“ll”
输出：2
例2：
输入：haystack =“aaaaa”，needle =“bba”
输出：-1
*/
package me.linpeng.leetcodeCN.Day180318;
class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0;
        while(i<haystack.length()&&j<needle.length())
        {
        	if(haystack.charAt(i)==needle.charAt(j))
        	{
        		i++;
        		j++;
        	}
        	else
        	{
        		i=i-j+1;
        		j=0;
        	}
        }
        if(j>=needle.length())
        	return i-needle.length();
        else
        	return -1;
    }
}