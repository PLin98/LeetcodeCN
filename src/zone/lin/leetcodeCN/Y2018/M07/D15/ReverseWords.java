/*给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
示例 1:
输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" */
package zone.lin.leetcodeCN.Y2018.M07.D15;

class Solution {
    public String ReverseWords(String s) {
        String[] str=s.split(" ");
        String s1="";
        for (int i = 0; i < str.length; i++) {
			char[] c=new char[str.length];
			for (int j = 0; j < str[i].length(); j++) {
				c[j]=str[i].charAt(str[i].length()-j-1);
			}
			if(i!=str.length-1) {
				s1+=String.valueOf(c)+" ";
			}else {
				s1+=String.valueOf(c);
			}
				
		}
        return s1;
    }
}
