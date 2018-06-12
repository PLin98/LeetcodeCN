/*给定一个单词，你需要判断单词的大写使用是否正确。
我们定义，在以下情况时，单词的大写用法是正确的：
全部字母都是大写，比如"USA"。
单词中所有字母都不是大写，比如"leetcode"。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
否则，我们定义这个单词没有正确使用大写字母。
示例 1:
输入: "USA"
输出: True
示例 2:
输入: "FlaG"
输出: False
注意: 输入是由大写和小写拉丁字母组成的非空单词。*/
/*1，那么如果都是小写值就为0,
2，如果都是大写那么值就是该字符串的长度，
3，如果值为1，那么看一下首字母是不是大写的*/
package zone.lin.leetcodeCN.Y2018.M06.D12;
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==null)
        	return false;
        int count=0;
        for(int i=0;i<word.length();i++)
        {
        	if(word.charAt(i)<='Z'&&word.charAt(i)>='A')
        		count++;
        }
        if(count==word.length()||(count==1&&word.charAt(0)<='Z'&&word.charAt(0)>='A')||count==0)
        	return true;
        return false;
    }
}
