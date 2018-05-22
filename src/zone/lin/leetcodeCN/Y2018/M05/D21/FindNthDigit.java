/*在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 个数字。
注意:
n 是正数且在32为整形范围内 ( n < 231)。
示例 1:
输入:3
输出:3
示例 2:
输入:11
输出:0
说明:第11个数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是0，它是10的一部分。*/
/*1-9:1*9个数
 *10-99：2*90=180个数字
 *100-999:3*900=1800个数字
 * 
 * 
 */
package zone.lin.leetcodeCN.Y2018.M05.D21;

class Solution {
    public int findNthDigit(int n) {
        int len=1;//实际数的长度
        long num=9,start=0;//数的开始和结束，0-9
        while(n>len*num)//查找n所在的区间
        {
        	n-=len*num;//判断是一位数，还是两位数，还是三位数
        	start+=num;//加一就是区间的开始，
        	len++;//长度加一，数的位数
        	num*=10;//长度每加一，数扩大10倍
        }
        int result;
        if(n%len==0)
        	result=(""+(start+n/len)).charAt(len-1)-'0';
        else
        	result=(""+(start+n/len+1)).charAt(n%len-1)-'0';
        return result;
    }
}
