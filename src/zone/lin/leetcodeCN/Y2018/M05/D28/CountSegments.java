/*统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
请注意，你可以假定字符串里不包括任何不可打印的字符。
示例:
输入: "Hello, my name is John"
输出: 5*/
package zone.lin.leetcodeCN.Y2018.M05.D28;
class Solution {
    public int countSegments(String s) {
       if(s==null)
    	   return 0;
       int count=0;
       boolean flag=true;
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)==' '||s.charAt(i)=='\t'||s.charAt(i)=='\n')
    		   flag=true;
    	   else if(flag)
    	   {
    		   count++;
    		   flag=false;
    	   }
       }
       return count;
    }
}