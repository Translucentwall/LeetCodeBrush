//使用队列实现栈的下列操作： 
//
// 
// push(x) -- 元素 x 入栈 
// pop() -- 移除栈顶元素 
// top() -- 获取栈顶元素 
// empty() -- 返回栈是否为空 
// 
//
// 注意: 
//
// 
// 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合
//法的。 
// 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。 
// 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。 
// 
// Related Topics 栈 设计

  
  package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues{
      public static void main(String[] args) {
           MyStack solution = new ImplementStackUsingQueues().new MyStack();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class MyStack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    /** Initialize your data structure here. */
    public MyStack() {
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue1.size()>1){
            queue2.add(queue1.remove());
        }
        int t = queue1.remove();
        Queue<Integer> tempQueue = queue2;
        queue2=queue1;
        queue1=tempQueue;
        return t;
    }
    
    /** Get the top element. */
    public int top() {
        while (queue1.size()>1){
            queue2.add(queue1.remove());
        }
        int t = queue1.remove();
        queue2.add(t);
        Queue<Integer> tempQueue = queue2;
        queue2=queue1;
        queue1=tempQueue;
        return t;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

  }