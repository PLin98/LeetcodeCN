//给出一个整数，写一个函数来确定这个数是不是4的一个幂。
package zone.lin.leetcodeCN.Y2018.M05.D12;
class Solution {
    public boolean isPowerOfFour(int num) {
      if(num<1)
    	  return false;
      return (num & num-1)==0 && (num&0x55555555)==num;  
    }
}