/*
编写一个函数来查找字符串数组中最长的公共前缀字符串
*/
package zone.lin.leetcodeCN.Y2018.M03.D13;
class Solution {
    public String longestCommonPrefix(String[] strs) {          
        if(strs.length==0)
        	return "";
        int min=Integer.MAX_VALUE; 
        for(String s:strs)
        {
        	if(s.length()<min)
        		min=s.length();
        }
        int i;
        for(i=0;i<min;i++)
        {
        	boolean flag=true;
        	 for(int j=0;j<strs.length;j++)
        	 {
        		 if(strs[0].charAt(i)!=strs[j].charAt(i))
        		 {
        			 flag=false;
        			 break;
        		 }
        	 }
        	 if(!flag)
        		 break;
        }
        String str=strs[0].substring(0, i);
        return str;
    }
}