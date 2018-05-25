/*给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
注意:假设字符串的长度不会超过 1010。
示例 1:
输入:"abccccdd"
输出:7
解释:我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。*/
package zone.lin.leetcodeCN.Y2018.M05.D24;
class Solution {
    public int longestPalindrome(String s) {
        int[] arr=new int[52];
        int i,max=0,len=0,flag=0;  
    for(i=0;i<52;i++)
    	arr[i]=0;  
    for(i=0;i<s.length();i++)  
    {  
        if(s.charAt(i)<=90) //uppercase  
            arr[s.charAt(i)-'A']++;  
        else //lowercase  
            arr[s.charAt(i)-'a'+26]++;  
    }  
    for(i=0;i<52;i++)  
    {  
        if(arr[i]%2==0)
        	max+=arr[i];  
        else   
        {  
            len+=arr[i]-1;  
            flag = 1;  
        }  
    }  
    return flag>0?max+len+1:max;  
    }
}