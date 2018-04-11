//设计一个支持 push，pop，top 操作，并能在常量时间内检索最小元素的栈。
//push(x) -- 将元素x推入栈中。
//pop() -- 删除栈顶的元素。
//top() -- 获取栈顶元素。
//getMin() -- 检索栈中的最小元素。
//示例:
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2
package zone.lin.leetcodeCN.Y2018.M04.D10;

import java.util.Stack;

class MinStack {
    Stack<Integer> sta=new Stack<Integer>();
    Stack<Integer> min=new Stack<Integer>();
    public void push(int x) {
        sta.push(x);
        if(min.size()==0){
            min.push(x);
        }
        else
        {
            int num=min.peek();
            if(num>x)
            {
                min.push(x);
            }
            else
            {
                min.push(num);
            }
        }
    }

    public void pop() {
         sta.pop();
         min.pop();
    }

    public int top() {
        return sta.peek();
    }

    public int getMin() {
       return  min.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */