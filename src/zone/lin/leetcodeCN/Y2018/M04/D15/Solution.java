//与 Excel表列名称 问题类似。
//给定一个Excel表格中的列名称，返回其相应的列序号。
//示例:
//
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
package zone.lin.leetcodeCN.Y2018.M04.D15;
class Solution {
    public int titleToNumber(String s) {
       int num=0;
       for(int i=0;i<s.length();i++)
       {
    	   num=s.charAt(i)-64+num*26;
       }
       return num;
    }
}
//result=(char)((n-1)%26+'A')+result;