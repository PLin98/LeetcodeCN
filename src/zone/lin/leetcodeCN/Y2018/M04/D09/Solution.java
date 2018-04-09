//给定一个链表，判断链表中否有环。
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
package zone.lin.leetcodeCN.Y2018.M04.D09;
class Solution {
    public boolean hasCycle(ListNode head) {
    	ListNode first=head;
    	ListNode last=head;
    	while(true)
    	{
    		if(first!=null)
    			first=first.next;
    		else
    			return false;
    		if(last.next!=null&&last.next.next!=null)
    			last=last.next.next;
    		else
    			return false;
    		if(first.val==last.val)
    			return true;    	
    	}
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) 
      {
          val = x;
          next = null;
      }
 }