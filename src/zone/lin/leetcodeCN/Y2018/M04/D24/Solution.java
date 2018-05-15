//反转一个单链表。
//进阶:
//链表可以迭代或递归地反转。你能否两个都实现一遍？
package zone.lin.leetcodeCN.Y2018.M04.D24;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        	return null;
        if(head.next==null)
        	return head;
        ListNode last=head;
        ListNode now=head.next;
        ListNode next=now.next;
        last.next=null;
        if(head.next!=null)
        {                   
        	next=now.next;
        	now.next=last;
        	last=now;
        	now=next;
        }
        head.next=last;
        return head;
        
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
