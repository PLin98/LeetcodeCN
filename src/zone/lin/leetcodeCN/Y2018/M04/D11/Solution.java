//编写一个程序，找到两个单链表相交的起始节点。
//例如，下面的两个链表：
//A:          a1 → a2
//                   ↘
//                     c1 → c2 → c3
//                   ↗            
//B:     b1 → b2 → b3
//在节点 c1 开始相交。
//注意：
//如果两个链表没有交点，返回 null.
//在返回结果后，两个链表仍须保持原有的结构。
//可假定整个链表结构中没有循环。
//程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存
package zone.lin.leetcodeCN.Y2018.M04.D11;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
        	return null;
        ListNode A=headA;
        ListNode B=headB;
        int lena=0,lenb=0;
        while(A.next!=null)
        {
        	lena++;
        	A=A.next;
        }
        while(B.next!=null)
        {
        	lenb++;
        	B=B.next;
        }
        if(A.val!=B.val)
        	return null;
        A=headA;
        B=headB;
        int res=lena-lenb;
        if(res>0)
        	for(int i=0;i<res;i++)
        		A=A.next;
        if(res<0)
        	for(int i=0;i<(lenb-lena);i++)
        		B=B.next;
        while(A.val!=B.val)
        {
        	A=A.next;
        	B=B.next;
        }
        return A;
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