//写一个算法来判断一个数是不是“快乐数”。
//一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
//然后重复这个过程直到这个数变为 1，或是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
//案例: 19 是一个快乐数。
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
package zone.lin.leetcodeCN.Y2018.M04.D20;
class Solution {
    public boolean isHappy(int n) {
        if(n<=0)
        	return false;
        while(n!=1&&n!=89)
        	n=sum(n);
        if(n==1)
        	return true;
        if(n==89)
        	return false;
        return false;
    }
    public int sum(int n)
    {
    	int sum=0;
    	while(n!=0)
    	{
    		sum+=(n%10)*(n%10);
    		n=n/10;
    	}
    	return sum;
    }
}
