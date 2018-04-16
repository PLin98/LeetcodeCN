//给定一个整数 n，返回 n! 结果尾数中零的数量。
//注意: 你的解决方案应为对数时间复杂度。
package zone.lin.leetcodeCN.Y2018.M04.D16;
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
       while(n!=0)
       {
    	   count+=n/5;
    	   n=n/5;
       }
        return count;    
    }
}