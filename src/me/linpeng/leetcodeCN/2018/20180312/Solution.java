/*
给定一个罗马数字，将其转换成整数。返回的结果要求在 1 到 3999 的范围内
基本字符    相应的阿拉伯数字表示为  
I           1  
V           5  
X           10  
L           50  
C           100  
D           500  
M           1000 
小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：Ⅷ = 8；Ⅻ = 12；
小的数字，（限于Ⅰ、X 和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：Ⅳ= 4；Ⅸ= 9；
*/
package me.linpeng.leetcodeCN.Day180312;
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.length()==0)
        	return 0;
        for(int i=0;i<s.length()-1;i++)
        {
        	if(roman(s.charAt(i))>=roman(s.charAt(i+1)))
        		sum+=roman(s.charAt(i));
        	else
        		sum-=roman(s.charAt(i));
        }
        sum+=roman(s.charAt(s.length()-1));
        if(sum>=1&&sum<=3999)
        	return sum;
        else
        	return 0;
    }
    public int roman(char a)
    {
    	switch(a)
    	{
    	case 'I':return 1;
    	case 'V':return 5;
    	case 'X':return 10;
    	case 'L':return 50;
    	case 'C':return 100;
    	case 'D':return 500;
    	case 'M':return 1000;
    	}
    	return -1;
    }
}
