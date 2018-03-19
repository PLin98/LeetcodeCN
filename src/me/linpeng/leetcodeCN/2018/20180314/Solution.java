/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
括号必须以正确的顺序关闭，"()" 和 "()[]{}" 是有效的但是 "(]" 和 "([)]" 不是。
*/
package me.linpeng.leetcodeCN.Day180314;

import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
         int i;
         Stack<Character> str=new Stack<Character>();
         for(i=0;i<s.length();i++)
         {
        	 if(s.charAt(i)=='(')
        		str.push('('); 
        	 if(s.charAt(i)==')')
        	 {
        		 if(!str.isEmpty()&&str.pop()=='(')
        			 continue;
        		 else
        			 return false;
        	 }
        	 if(s.charAt(i)=='[')
         		str.push('['); 
         	 if(s.charAt(i)==']')
         	 {
         		 if(!str.isEmpty()&&str.pop()=='[')
         			 continue;
         		 else
         			 return false;
         	 }
         	if(s.charAt(i)=='{')
        		str.push('{'); 
        	 if(s.charAt(i)=='}')
        	 {
        		 if(!str.isEmpty()&&str.pop()=='{') 
        			 continue;
        		 else
        			 return false;
        	 }
         }
         if(str.empty())
        	 return true;
         else 
        	 return false;
    }
}
