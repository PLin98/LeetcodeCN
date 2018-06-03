/*给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
示例 1:
输入: "abab"
输出: True
解释: 可由子字符串 "ab" 重复两次构成。
示例 2:
输入: "aba"
输出: False
示例 3:
输入: "abcabcabcabc"
输出: True
解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)*/
package zone.lin.leetcodeCN.Y2018.M06.D02;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i,j;
    	for(i=s.length()/2;i>=1;--i)//i为原字符串的可重复子串的子串的长度
        {
        	if(s.length()%i==0)//n%i == 0：长度为i的子串可以切分str，否则，str的长度不能整除i，表示str就不可能由若干子串重复组成
        	{
        		int c=s.length()/i;//m: str中长度为i的子串的个数 
        		String t=s.substring(0, i);//比较每个子串是否相等，substr1为第一个子串   
        		for(j=1;j<c;++j)
        		{
        			 String s2 = s.substring(j*i,(j+1)*i);//substr2为遍历的其他子串
        			 if(!t.equals(s2)) { //判断substr1与substr2是否相等
                         break;//如果不等，则跳出循环
                     }
        		}
        		if(j==c) //如果全部比较完才跳出上面的循环，此时j==m，则表示能找到一个子串，重复若干次变成str，返回true
        			return true;
        	}
        }
        return false;
    }
}