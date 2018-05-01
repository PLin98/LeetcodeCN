//请检查一个链表是否为回文链表
package zone.lin.leetcodeCN.Y2018.M05.D01;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode p1,p2,p3,p4;
        p4=null;
        p1=p2=p3=head;
        int length=0;
        if(head==null||head.next==null)
        	return true;
        while(p1!=null)
        {
        	p1=p1.next;
        	length++;
        }
        for(int i=0;i<length/2;i++)
        {
        	p3=p2.next;//p3后移到下一个节点
        	p2.next=p4;//拆掉p2与下一个节点连接
        	p4=p2;//p4是头结点
        	p2=p3;//p2也到下一个节点
        }
        if(length%2==1)
        	p3=p3.next;
        while(p3!=null&&p4!=null)
        {
        	if(p3.val!=p4.val)
        		return false;
        	p3=p3.next;
        	p4=p4.next;
        }
        return true;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }