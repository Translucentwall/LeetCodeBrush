//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表

  
  package leetcode.editor.cn;
  public class MergeTwoSortedLists{
      public static void main(String[] args) {
           Solution solution = new MergeTwoSortedLists().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode re = head;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                re.next = l1;
                l1 = l1.next;
            }else {
                re.next = l2;
                l2 = l2.next;
            }
            re = re.next;
        }
        re.next = l1==null?l2:l1;
        return head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

       class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
  }

