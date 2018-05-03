/*请编写一个函数，使其可以删除某个链表中给定的（非末尾的）节点，您将只被给予要求被删除的节点。
比如：假设该链表为 1 -> 2 -> 3 -> 4  ，给定您的为该链表中值为 3 的第三个节点，
那么在调用了您的函数之后，该链表则应变成 1 -> 2 -> 4 。*/
package zone.lin.leetcodeCN.Y2018.M05.D03;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode p;
        if(node==null)
        	return ;
        p=node.next;//将p指向的结点删除
        node.val=p.val;
        node.next=p.next;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }