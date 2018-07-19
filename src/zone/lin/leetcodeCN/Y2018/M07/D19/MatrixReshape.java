package zone.lin.leetcodeCN.Y2018.M07.D19;

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c!=nums.length*nums[0].length)
        	return nums;
        else
        {
        	int[][] res=new int[r][c];
        	int x=0,y=-1;
        	for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[i].length; j++) {
					if(i*nums[i].length+(j+1)<=(x+1)*c) {
						y++;
						res[x][y]=nums[i][j];
						
					}else {
						x++;
						y=0;
						res[x][y]=nums[i][j];
					}
				}
			}
        	 return res;
        }
       
    }
}