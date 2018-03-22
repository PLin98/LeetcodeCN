/*
给定一个字符串， 包含大小写字母、空格 ' '，请返回其最后一个单词的长度。
如果不存在最后一个单词，请返回 0 。
注意事项：一个单词的界定是，由字母组成，但不包含任何的空格。
案例:
输入: "Hello World"
输出: 5
*/
package zone.lin.leetcodeCN.Y2018.M03.D22;
class Solution {
    public int lengthOfLastWord(String s) {
    	int j=0;
    	boolean flag=true;
        for(int i=s.length()-1;i>=0;i--)
        {
        	if(flag&&s.charAt(i)==' ')
        		continue;
        	else if(s.charAt(i)!=' ')
        	{
        		flag=false;
        		j++;
        	}
        	else
        		break;
        } 
        return j;
    }
}