//给定一个正整数，返回它在Excel表中相对应的列名称。
//示例：
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
package zone.lin.leetcodeCN.Y2018.M04.D13;
class Solution {
    public String convertToTitle(int n) {
    	String result="";
    	while(n>0)
    	{
    		result=(char)((n-1)%26+'A')+result;
    		n=(n-1)/26;
    	}
    	return result;
    }
}