/*数数并说序列是一个整数序列，第二项起每一项的值为对前一项的计数，其前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作 "一个一" 即 11。
11 被读作  "两个一" 即 21。
21 被读作  "一个二 和 一个一" 即 1211。

给一个正整数 n ，输出数数并说序列的第 n 项。

注意：该整数序列的每项都输出为字符串。*/
package zone.lin.leetcodeCN.Y2018.M03.D20;

public class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=1;i<n;i++)
        {
        	String str=new String(result);
            result="";
        	int n1=1;
        	char c=str.charAt(0);
        	for(int j=1;j<str.length();j++)
        	{
        		if(str.charAt(j)==c)
        			n1++;
        		else
        		{
        			result=result+n1+c;
        			c=str.charAt(j);
        			n1=1;
        		}
        	}
        	result=result+n1+c;
        }
        return result;
        	
    }
}