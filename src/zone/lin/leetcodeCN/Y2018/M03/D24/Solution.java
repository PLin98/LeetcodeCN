//给定两个二进制字符串，返回他们的和（用二进制表示）。
//案例：
//a = "11"
//b = "1"
//返回 "100" 。
package zone.lin.leetcodeCN.Y2018.M03.D24;
class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){  
            String temp = a;  
            a =b;  
            b = temp;  
        }  
        int la = a.length()-1;  
        int lb = b.length()-1;  
        int c = 0;  
        String res = ""; 
        while(lb >= 0){
            int sum = (int)(a.charAt(la)-'0')+(int)(b.charAt(lb)-'0')+c;  
            res = String.valueOf(sum%2)+res;  
            c =sum/2;  
            la--;  
            lb--;  
        }  
          while(la>=0){
            int sum = (int)(a.charAt(la)-'0')+c;  
            res = String.valueOf(sum%2)+res;  
            c =sum/2;  
            la--;  
        }  
          
        if (c==1){  
            res ="1"+res;
        }  
        return res;  
    }  
} 
