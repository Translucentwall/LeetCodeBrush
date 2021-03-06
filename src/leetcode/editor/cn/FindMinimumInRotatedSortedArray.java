//假设按照升序排序的数组在预先未知的某个点上进行了旋转。 
//
// ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。 
//
// 请找出其中最小的元素。 
//
// 你可以假设数组中不存在重复元素。 
//
// 示例 1: 
//
// 输入: [3,4,5,1,2]
//输出: 1 
//
// 示例 2: 
//
// 输入: [4,5,6,7,0,1,2]
//输出: 0 
// Related Topics 数组 二分查找

  
  package leetcode.editor.cn;
  public class FindMinimumInRotatedSortedArray{
      public static void main(String[] args) {
           Solution solution = new FindMinimumInRotatedSortedArray().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0) return -1;
        int start=0, end=nums.length-1, mid;
        while (start+1<end){
            mid = start+(end-start)/2;
            if(nums[mid]<=nums[end]) end=mid;
            else start=mid;
        }
        if(nums[start]>nums[end]) return nums[end];
        return nums[start];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }