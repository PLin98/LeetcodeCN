/*不使用运算符 + 和-，计算两整数a 、b之和。
示例：
若 a = 1 ，b = 2，返回 3。*/
package zone.lin.leetcodeCN.Y2018.M05.D18;
class Solution {
    public int getSum(int a, int b) {
        //采用位运算
    	int c=0,d=0;
    	while((a&b)!=0)//a,b是否有进位
    	{
    		c=a^b;//a异或b,忽略进位相加
    		d=(a&b)<<1;//进位的值
    		a=c;
    		b=d;
    	}
    	return a|b;//a或b
    }
}
