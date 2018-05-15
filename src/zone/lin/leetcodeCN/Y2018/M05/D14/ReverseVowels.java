/*编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
示例 1：给定 s = "hello", 返回 "holle".
示例 2：给定 s = "leetcode", 返回 "leotcede"
注意:元音字母不包括 "y"*/
package zone.lin.leetcodeCN.Y2018.M05.D14;
class Solution {
    public String reverseVowels(String s) {
    	if(s.length()==0)
    		return "";
       	char[] ch = s.toCharArray();
       	int left=0,right=s.length()-1;
       	while(left<right)
       	{
       		if(isVowels(ch[left])&&isVowels(ch[right]))
       		{
       			char t=ch[left];
       			ch[left]=ch[right];
       			ch[right]=t;
       		}
       		else if(isVowels(ch[left]))
       			--right;
       		else
       			--left;
       	}
       	String SEnd = String.valueOf(ch);
        return SEnd;     
    }
    public boolean isVowels(char s)
	{
		return s=='a'||s=='e'||s=='i'||s=='o'||s=='u';
	}
}