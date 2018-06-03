/*两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
给出两个整数 x 和 y，计算它们之间的汉明距离。
注意：
0 ≤ x, y < 231.
示例:
输入: x = 1, y = 4
输出: 2
解释:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
上面的箭头指出了对应二进制位不同的位置。*/
package zone.lin.leetcodeCN.Y2018.M06.d03;
class Solution {
    public int hammingDistance(int x, int y) {
        int z=x^y;//得到的结果中某位为1，则对应的原来两个数中该位是不同的。
        int count=0;
        while(z!=0) {
        	++count;
        	z=z&(z-1);//使得n的二进制数表示中最后一位1变成0。
        }
        return count;
    }
}