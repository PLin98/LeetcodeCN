/*给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
注意：
num1 和num2 的长度都小于 5100.
num1 和num2 都只包含数字 0-9.
num1 和num2 都不包含任何前导零。
你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。*/
package zone.lin.leetcodeCN.Y2018.M05.D27;
class Solution {
    public String addStrings(String num1, String num2) {
        String res="";
        int len1=num1.length();
        int len2=num2.length();
        int flag=0;
        for(int i=len1-1,j=len2-1;i>=0||j>=0;--i,j--)
        {
        	int temp=0;
        	if(i>=0)
        		temp+=(num1.charAt(i)-'0');
        	if(j>=0)
        		temp+=(num2.charAt(j)-'0');
        	if(flag!=0)
        		++temp;
        	flag=temp/10;
        	temp=temp%10;
        	res=String.valueOf(temp)+res;//String.valueOf():转换成字符串
        }
        if(flag!=0)
        	res=String.valueOf(flag)+res;
        return res;
    }
}
