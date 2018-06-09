/*给定一个整数，将其转化为7进制，并以字符串形式输出。
示例 1:
输入: 100
输出: "202"
示例 2:
输入: -7
输出: "-10"
注意: 输入范围是 [-1e7, 1e7] 。*/
package zone.lin.leetcodeCN.Y2018.M06.D09;

class Solution {
    public String convertToBase7(int num) {
    	if(num==0)
    		return "0";
        String res="";
        int flag=0;
        while(num!=0) {
        	if(num>0) {
	        	res=num%7+res;
	        	num/=7;
        	}else if(num<0) {
        		flag=1;
        		num=Math.abs(num);
        		res=num%7+res;
	        	num/=7;
        	}
        }
        if(flag==1)
        	return "-"+res;
        return res; 
    }
}
