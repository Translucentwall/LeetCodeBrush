//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。 
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。 
//
// 此外，你可以假设该网格的四条边均被水包围。 
//
// 
//
// 示例 1: 
//
// 输入:
//11110
//11010
//11000
//00000
//输出: 1
// 
//
// 示例 2: 
//
// 输入:
//11000
//11000
//00100
//00011
//输出: 3
//解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
// 
// Related Topics 深度优先搜索 广度优先搜索 并查集

  
  package leetcode.editor.cn;
  public class NumberOfIslands{
      public static void main(String[] args) {
           Solution solution = new NumberOfIslands().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0; i<grid.length; ++i){
            for(int j=0; j<grid[0].length; ++j){
                if(grid[i][j]=='1'&&dfs(grid,i,j)>0) ans++;
            }
        }
        return ans;
    }

    int dfs(char[][] grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length) return 0;
        if(grid[i][j]=='1'){
            grid[i][j]=0;
            return 1+dfs(grid,i-1,j)+dfs(grid,i+1,j)
                    +dfs(grid,i,j-1)+dfs(grid,i,j+1);
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }