/*请编写一个函数，其功能是将输入的字符串反转过来。
示例：
输入：s = "hello"
返回："olleh"*/
/*char[] ch = s.toCharArray();  字符串转换成字符
String SEnd = String.valueOf(ch);  字符转换成字符串*/
package zone.lin.leetcodeCN.Y2018.M05.D13;
class Solution {
    public String reverseString(String s) {
    	 char[] ch = s.toCharArray();
    	int len = s.length();
        for (int i = 0; i < len/2; i++) {
            char c = ch[i];
            ch[i] = ch[len -1 - i];
            ch[len-1-i] = c;
        }
        String SEnd = String.valueOf(ch);
        return SEnd;
    }
}