//给定 numRows, 生成帕斯卡三角形的前 numRows 行。
//例如, 给定 numRows = 5,
//返回
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
package zone.lin.leetcodeCN.Y2018.M04.D03;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        int i,j;
        if(numRows<=0)
        	return null;
        List<Integer> res=new ArrayList<>();
        res.add(1);
        result.add(res);
        List<Integer> last=res;
        for(i=0;i<numRows;i++)
        {
        	res= new ArrayList<>();
        	res.add(1);
        	for(j=0;j<i;j++)
        	{
        		res.add(last.get(j-1)+last.get(j));        	
        	}
        	res.add(1);
            result.add(res);
            last=res;
        }
        return result; 
    }
}
