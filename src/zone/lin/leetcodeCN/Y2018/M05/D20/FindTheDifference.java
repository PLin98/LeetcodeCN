/*给定两个字符串 s 和 t，它们只包含小写字母。
字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
请找出在 t 中被添加的字母。
示例:输入：
s = "abcd"
t = "abcde"
输出：e
解释：'e' 是那个被添加的字母。*/
package zone.lin.leetcodeCN.Y2018.M05.D20;
class Solution {
    public char findTheDifference(String s, String t) {
        int temp=0x00;//十六进制
        for(int i=0;i<s.length();i++)
        	temp=(char)temp^s.charAt(i);
        for(int i=0;i<t.length();i++)
        	temp=(char)temp^t.charAt(i);
        return (char)temp;
    }
}
