/*给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
示例:
输入: s = "abcdefg", k = 2
输出: "bacdfeg"
要求:
该字符串只包含小写的英文字母。
给定字符串的长度和 k 在[1, 10000]范围内。*/
package zone.lin.leetcodeCN.Y2018.M06.D15;

class Solution {
    public String reverseStr(String s, int k) {
        int len=s.length();
        char[] ch=s.toCharArray();
        int index=0;
        while(index<len) {
        	if(len-index>k) {
        		for(int i=index,j=index+k-1;i<j;i++,j--) {
        			char temp=ch[i];
        			ch[i]=ch[j];
        			ch[j]=temp;
        		}
        		index=index+2*k;
        	}else {
        		for(int i=index,j=len-1;i<j;i++,j--) {
        			char temp=ch[i];
        			ch[i]=ch[j];
        			ch[j]=temp;
        		}
        		index=len;
        	}
        }
        return new String(ch);
    }
}
