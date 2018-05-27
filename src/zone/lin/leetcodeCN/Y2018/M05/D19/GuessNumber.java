/*我们正在玩一个猜数字游戏。 游戏规则如下：
我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
每次你猜错了，我会告诉你这个数字是大了还是小了。
你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
-1 : 我的数字比较小
 1 : 我的数字比较大
 0 : 恭喜！你猜对了！
示例:
n = 10, 我选择 6.
返回 6.*/
package zone.lin.leetcodeCN.Y2018.M05.D19;
/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */

class Solution extends GuessGame {
	 public int guessNumber(int n) {
	     int low=1,high=n;
	     while(low<high)
	     {
		     int mid=low+(high-low)/2;
		     int m=GuessGame(mid);
		     if(m==1)
		    	 mid=low+1;
		     else if(m==-1)
		    	 mid=high-1;
		     else
		    	 return mid;
	     }
		return 0;
	 }

	private int GuessGame(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
