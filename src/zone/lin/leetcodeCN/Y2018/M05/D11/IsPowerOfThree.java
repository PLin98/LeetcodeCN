//给出一个整数，写一个函数来确定这个数是不是3的一个幂。
package zone.lin.leetcodeCN.Y2018.M05.D11;
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
        	return false;
        while(n>1) {
        	int m=n%3;
        	if(m!=0)
        		return false;
        	n/=3;
        }
        return true;
    }
}