//计算所有小于非负数整数 n 的质数数量
package zone.lin.leetcodeCN.Y2018.M04.D22;
class Solution {
    public int countPrimes(int n) {
    	if(n<=2)
    		return 0;
    	boolean[] primes=new boolean[n];
    	for(int i=0;i<n;i++)
    		primes[i]=true;
    	for(int i=2;i<n;i++)
    	{
    		if(primes[i])
    		{
    			int temp=i+i;
    			while(temp<n)
    			{
    				primes[temp]=false;
    				temp+=i;
    			}
    		}
    	}
    	int count=0;
    	for(int i=2;i<n;i++)
    		if(primes[i])
    			count++;
    	return count;
    }
}
