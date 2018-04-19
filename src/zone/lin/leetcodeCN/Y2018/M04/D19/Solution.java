//颠倒给定的32位无符号整数的二进制位。
//例如，给定输入 43261596（二进制表示为 00000010100101000001111010011100 ），
//返回 964176192（二进制表示为 00111001011110000010100101000000）。
package zone.lin.leetcodeCN.Y2018.M04.D19;
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++)
        {
        	result+=n&1;
        	n>>>=1;
        	if(i<31)
        		result<<=1;
        }
        return result;
    }
}