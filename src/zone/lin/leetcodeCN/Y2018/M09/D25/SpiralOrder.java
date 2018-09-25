/*给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
示例 1:
输入:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
输出: [1,2,3,6,9,8,7,4,5]
示例 2:

输入:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
输出: [1,2,3,4,8,12,11,10,9,5,6,7]*/

package zone.lin.leetcodeCN.Y2018.M09.D25;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res=new ArrayList<>();
    	if(matrix==null||matrix.length==0)
    		return res;
    	int i=matrix.length;
    	int j=matrix[0].length;
    	//计算环数,以小的数最为环数
    	int loop=i>j?(j+1)/2:(i+1)/2;
    	
    	
    	for(int k=0;k<loop;k++,i-=2,j-=2) {
    		for(int col=k;col<k+j;col++)
    			res.add(matrix[k][col]);
    		for(int row=k+1;row<k+i;row++)
    			res.add(matrix[row][k+j-1]);
    	
    	//最后一环为一行或一列，则在上两步之后已经全部输出，直接退出即可
    	if(i==1||j==1)
    		break;
    	for(int col=k+j-2;col>=k;col--)
    		res.add(matrix[k+i-1][col]);
    	for(int row=k+i-2;row>k;row--)
    		res.add(matrix[row][k]);
    	
    	}
    	return res;
        
    }
}
