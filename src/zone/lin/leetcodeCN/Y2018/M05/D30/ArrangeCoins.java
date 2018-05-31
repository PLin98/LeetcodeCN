package zone.lin.leetcodeCN.Y2018.M05.D30;

class Solution {
    public int arrangeCoins(int n) {
    	/*int level=0,height=n;
    	while(level<=height)
    	{
    		int mid=level+(height-1)/2;
    		int sum=mid*(mid+1)/2;
    		if(sum==n)
    			return mid;
    		else if(sum<n)
    			level=mid+1;
    		else
    			height=mid-1;
    	}
    	return height;*/
    	 int level = 1;
    	    while (n > 0) {
    	        n -= level;
    	        level++;
    	    }
    	    return n == 0 ? level - 1 : level - 2;
    }
}
