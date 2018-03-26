//你正在爬楼梯。需要 n 步你才能到达顶部。
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方式可以爬到楼顶呢？
//注意：给定 n 将是一个正整数。
//示例 1：
//输入： 2
//输出： 2
//说明： 有两种方法可以爬到顶端。
//1.  1 步 + 1 步
//2.  2 步
//示例 2：
//输入： 3
//输出： 3
//说明： 有三种方法可以爬到顶端。
//1.  1 步 + 1 步 + 1 步
//2.  1 步 + 2 步
//3.  2 步 + 1 步
package zone.lin.leetcodeCN.Y2018.M03.D26;
class Solution {
    public int climbStairs(int n) {
        int i,k=0;
        int a=0,b=1;
        for(i=1;i<=n;i++)
        {
        	k=b;
        	b=a;
        	a=k;
        }
        return b;
    }
}