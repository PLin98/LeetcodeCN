//删除链表中等于给定值 val 的所有元素。
//示例
//给定: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
//返回: 1 --> 2 --> 3 --> 4 --> 5
package zone.lin.leetcodeCN.Y2018.M04.D21;
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
        if(head==null)
            return head;
        ListNode p=head,q=head.next;
        while(q!=null)
        {
        	if(q.val==val)
        	{
        		p.next=q.next;
        		q=q.next;
        	}
        	else
        	{
        		p=p.next;
        		q=q.next;
        	}
        }
        if(head.val==val)
            head=head.next;
        return  head;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) 
	      { 
	    	  val = x; 
	      }
}