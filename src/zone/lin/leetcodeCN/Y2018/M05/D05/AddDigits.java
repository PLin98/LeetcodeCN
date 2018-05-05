/*给一个非负整数 num，反复添加所有的数字，直到结果只有一个数字。
例如:
设定 num = 38，过程就像： 3 + 8 = 11, 1 + 1 = 2。 由于 2 只有1个数字，所以返回它。*/
package zone.lin.leetcodeCN.Y2018.M05.D05;
class Solution {
    public int addDigits(int num) {
        int endnum=0;
        if(num<10)
        	return num;
        while(true) 
        {
	        while(num!=0)
	        {
	        	int n=num%10;
	        	endnum+=n;
	        	num/=10;
	        }
	        if(endnum<10)
	        	break;
	        num=endnum;
	        endnum=0;
        }
        return endnum;
    }
}