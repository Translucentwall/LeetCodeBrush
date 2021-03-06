//删除链表中等于给定值 val 的所有节点。 
//
// 示例: 
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
// 
// Related Topics 链表

  
  package leetcode.editor.cn;
  public class RemoveLinkedListElements{
      public static void main(String[] args) {
           Solution solution = new RemoveLinkedListElements().new Solution();
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode preHead = temp;
        while (temp.next!=null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        return preHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  }