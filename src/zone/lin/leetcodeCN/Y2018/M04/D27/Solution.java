/*使用队列实现栈的下列操作：
push(x) --元素 x 入栈
pop() -- 移除栈顶元素
top() -- 获取栈顶元素
empty() --返回栈是否为空
注意:
你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
你所使用的语言也许不支持队列。 你可以使用 list 或者 deque (双端队列) 来模拟一个队列 , 只要是标准的队列操作即可。
假设所有操作都是有效的 (例如, 对一个空的栈不会调用 pop 或者 top 操作)。*/
package zone.lin.leetcodeCN.Y2018.M04.D27;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	int top;
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
        top=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1)
        {
        	top=q1.remove();
        	q2.offer(top);
        }
        int x=q1.remove();
        Queue<Integer> temp = new LinkedList<Integer>();
        q1=q2;
        q2=temp;
        return x;
    }
    
    /** Get the top element. */
    public int top() {
    	return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
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
