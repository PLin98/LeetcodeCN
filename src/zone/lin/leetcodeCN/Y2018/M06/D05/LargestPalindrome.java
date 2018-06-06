/*你需要找到由两个 n 位数的乘积组成的最大回文数。
由于结果会很大，你只需返回最大回文数 mod 1337得到的结果。
示例:
输入: 2
输出: 987
解释: 99 x 91 = 9009, 9009 % 1337 = 987
说明:
n 的取值范围为 [1,8]。*/
package zone.lin.leetcodeCN.Y2018.M06.D05;
class Solution {
    public int largestPalindrome(int n) {
        if(n==1)
        	return 9;
        int max=(int) (Math.pow(10, n)-1);
        for(int i=max;i>max/10;i--) {
        	long temp=Palindrome(i);
        	for(int j=max;j*j>=temp;j--) {
        		if(temp%j==0)
        			return (int)(temp%1337);
        	}
        }
        return 0;
    }
    public long Palindrome(int i){
    	StringBuffer s=new StringBuffer();
        s.append(Integer.toString(i)).reverse();
        return Long.parseLong(i+s.toString());
    }
}
