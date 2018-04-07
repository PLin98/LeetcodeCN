//给定一个字符串，确定它是否是回文，只考虑字母数字字符和忽略大小写。
//例如：
//"A man, a plan, a canal: Panama" 是回文字符串。
//"race a car" 不是回文字符串。
//注意:
//你有考虑过这个字符串可能是空的吗？ 在面试中这是一个很好的问题。
//针对此题目，我们将空字符串定义为有效的回文字符串。
package zone.lin.leetcodeCN.Y2018.M04.D07;
class Solution {
    public boolean isPalindrome(String s) {
    	if(s == null){  
            return true;
        }  
        s  = s.toUpperCase();  
        int height = s.length()-1;  
        int low = 0;  
        while(low < height)
        {  
            while(low < height && !isRight(s.charAt(low)))
            {  
                low++;  
            }  
            while(low < height && !isRight(s.charAt(height)))
            {  
                height--;  
            }  
            if(s.charAt(low) != s.charAt(height)){  
                return false;  
            }  
            else
            {  
                low ++;  
                height --;  
            }  
        }  
        return true;  
    }  
    public static boolean isRight(char s){  
        if(s>=65 && s<=90){  
            return true;  
        }  
        if(s>=48 &&s<=57){  
            return true;  
        }  
        return false;  
    }
}












/*
if(s.length()==0)
        	return true;
        String temp="";
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)>=48&&s.charAt(i)<=57)
        		temp+=s.charAt(i)+32;
        	if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>='0'&&s.charAt(i)<='9')
        		temp+=s.charAt(i);
        }
        for(int i=0;i<temp.length()/2;i++) {
        	if(temp.charAt(i)!=temp.charAt(temp.length()-1-i))
        		return false;
        }
        return true;
*/