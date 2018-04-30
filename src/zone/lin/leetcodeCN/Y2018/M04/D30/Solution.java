/*使用栈实现队列的下列操作：
push(x) -- 将一个元素放入队列的尾部。
pop() -- 从队列首部移除元素。
peek() -- 返回队列首部的元素。
empty() -- 返回队列是否为空。
注意:
你只能使用标准的栈操作-- 也就是只有push to top, peek/pop from top, size, 和 is empty 操作是合法的。
你所使用的语言也许不支持栈。你可以使用 list 或者 deque (双端队列) 来模拟一个栈，只要是标准的栈操作即可。
假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。*/
package zone.lin.leetcodeCN.Y2018.M04.D30;

import java.util.Stack;

class MyQueue {
	Stack<Integer> sta1=new Stack<Integer>();
	Stack<Integer> sta2=new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
    	
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        sta1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(sta2.empty()) 
    	{
	    	while(!sta1.empty())
	    	{
		       int temp=sta1.pop();
		       sta2.push(temp);
	    	}
    	}
    	int re=sta2.peek();
    	sta2.pop();
    	return re;
    }
    
    /** Get the front element. */
    public int peek() {
    	if(sta2.empty())
    	{
	    	while(!sta1.empty())
	    	{
		       int temp=sta1.pop();
		       sta2.push(temp);
	    	}
    	}
    	return sta2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(sta1.empty()&&sta2.empty())
        	return true;
        else
        	return false;
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */