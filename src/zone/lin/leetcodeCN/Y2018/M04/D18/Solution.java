//编写一个函数，输入是一个无符号整数，返回的是它所有 位1 的个数（也被称为汉明重量）。
//例如，32位整数 '11' 的二进制表示为 00000000000000000000000000001011，
//所以函数返回3。
//>>是带符号右移，负数高位补1，正数补0
//<<左移不管负数还是正数，在低位永远补0
//>>>是不带符号右移，不论负数还是正数，高位补0
package zone.lin.leetcodeCN.Y2018.M04.D18;
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i=0;
        while(n!=0)
        {
        	if(n%2!=0)
        	{
        		i++;
        	}
        	n=n>>>1;
        }
        return i;
    }
}