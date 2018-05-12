/*给定一个数组，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
例如：
给定nums = [-2, 0, 3, -5, 2, -1]，求和函数为sumRange()
sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
注意:
你可以假设数组不可变。
会多次调用 sumRange 方法。*/ 
package zone.lin.leetcodeCN.Y2018.M05.D10;
class NumArray {
	int[] var;
    public NumArray(int[] nums) {
        var=new int[nums.length];
    	if(nums.length==0)
        	return;
        var[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        	var[i]=var[i-1]+nums[i];
    }
    
    public int sumRange(int i, int j) {
        if(var.length==0)
        	return 0;
        if(i<=0)
        	return var[j];
        if(j>var.length-1)
        	j=var.length-1;
        return var[j]-var[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
