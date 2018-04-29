//给定一个整数，写一个函数来判断它是否是2的幂。
//2=10  4=100 8=1000  1=01  3=011  7=0111
//10&01==0  100&011==0  1000&0111==0
package zone.lin.leetcodeCN.Y2018.M04.D29;
class Solution {
    public boolean isPowerOfTwo(int n) {
    	if(n==0)
    		return false;
    	if(n==1)
    		return true;
    	if(n>=2)
    	{
    		if((n&(n-1))==0)
    			return true;
    	}
		return false;
    }
}