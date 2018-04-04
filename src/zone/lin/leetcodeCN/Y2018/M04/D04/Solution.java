//给定一个索引 k，返回帕斯卡三角形（杨辉三角）的第 k 行。
//例如，给定 k = 3，
//则返回 [1, 3, 3, 1]。
package zone.lin.leetcodeCN.Y2018.M04.D04;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        int i,j;
        if(rowIndex<0)
        	return result;
        List<Integer> res=new ArrayList<>();
        res.add(1);
        List<Integer> last=res;
        for(i=0;i<rowIndex;i++)
        {
        	res= new ArrayList<>();
        	res.add(1);
        	for(j=1;j<=i;j++)
        	{
        		res.add(last.get(j-1)+last.get(j));        	
        	}
        	res.add(1);
            last=res;
        }
        return last; 
    }
}
