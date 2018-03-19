/*
给定两个非空链表来代表两个非负数，位数按照逆序方式存储，它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
你可以假设除了数字 0 之外，这两个数字都不会以零开头。
示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 80
*/
package me.linpeng.leetcodeCN.Day180307;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp=l1;
		while(l1.next!= null) {
			ListNode listNode=new ListNode(0);
			listNode.val=l1.val+l2.val;
            listNode.next=l1.next;
            tmp.next=listNode;
            l1=l1.next;
            l2=l2.next;
		}
		return tmp;

    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
