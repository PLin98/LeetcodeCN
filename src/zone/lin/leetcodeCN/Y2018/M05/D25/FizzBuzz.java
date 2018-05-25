/*写一个程序，输出从 1 到 n 数字的字符串表示。
1. 如果 n 是3的倍数，输出“Fizz”；
2. 如果 n 是5的倍数，输出“Buzz”；
3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
示例：n = 15,
返回:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]*/
package zone.lin.leetcodeCN.Y2018.M05.D25;

import java.util.ArrayList;
import java.util.List;


//为什么取余顺序不同就不正确？？？？？？？
/*class Solution {
    public List<String> fizzBuzz(int n) {
    	ArrayList<String> s = new ArrayList<String>();
    	for(int i=1;i<=n;i++)
    	{
    		if(n%3==0)
    		{
    			s.add("Fizz");
    			continue;
    		}
    		else if(n%5==0)
    		{
    			s.add("Buzz");
    			continue;
    		}
    		else if(n%3==0&&n%5==0)
    		{
    			s.add("FizzBuzz");
    			continue;
    		}
    		else
    			s.add(String.valueOf(i));
    	}
    	return s;*/
    	class Solution {
    	    public List<String> fizzBuzz(int n) {
    	    	List<String> s = new ArrayList<String>();
    	    	for(int i=1;i<=n;i++)
    	    	{
    	    		if (i % 3 == 0 && i % 5 == 0) 
    	                s.add("FizzBuzz");
    	            else if (i % 3 == 0) 
    	                s.add("Fizz");
    	            else if (i % 5 == 0) 
    	                s.add("Buzz");
    	            else 
    	                s.add(String.valueOf(i));
    	    	}
    	    	return s;
    	    }
    	}