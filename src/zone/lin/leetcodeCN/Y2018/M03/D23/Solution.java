/*
给定一个非负整数组成的非空数组，给整数加一。
可以假设整数不包含任何前导零，除了数字0本身。
最高位数字存放在列表的首位。
*/
package zone.lin.leetcodeCN.Y2018.M03.D23;
class Solution {
    public int[] plusOne(int[] digits) {
        int flag=1;
        int i;
    	for(i=digits.length-1;i>=0;i--)
        {
    		digits[i]=digits[i]+1;
        	if(digits[i]>9)
        	{
        		flag=1;
        		digits[i]=0;
        	}
        	else
        		return digits;
        }
    	if(i==-1&&flag==1) 
    	{
    		int[] temp=new int[digits.length+1];
    		temp[0]=1;
    		for(i=1;i<=digits.length;i++)
    		{
    			temp[i]=digits[i-1];
    		}
    		return temp;
    	}
    	else
    		return digits;
    }
}