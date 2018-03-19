package me.linpeng.leetcodeCN.Day180315;
import me.linpeng.leetcodeCN.Day180315.ListNode;
public class test {
	public static void main(String[] args) {
		Solution solution=new Solution();
		ListNode l1 = new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next=new ListNode(3);
		l2.next.next=new ListNode(4);
		ListNode l3=solution.mergeTwoLists(l1, l2);
		while(l3!=null)
		{
			System.out.print(l3.val+" ");
			l3=l3.next;
		}
	}
}
/*
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p=new ListNode(0);
        ListNode l3=p;
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        while(l1.next!=null&&l2.next!=null)
        {
        	if(l1.val<=l2.val)
        	{
        		p.next=l1;
        		p=l1;
        		l1=l1.next;
        	}
        	else
        	{
        		p.next=l2;
        		p=l2;
        		l2=l2.next;
        	}
        }
        if(l1!=null)
        	p.next=l1;
        if(l2!=null)
        	p.next=l2;
        return l3.next;
    }
}
*/
