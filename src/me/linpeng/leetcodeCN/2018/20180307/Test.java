package me.linpeng.leetcodeCN.Day180307;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution=new Solution();
		ListNode l1 = new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		ListNode l3=solution.addTwoNumbers(l1, l2);
		while(l3!=null)
		{
			System.out.print(l3.val+"->");
			l3=l3.next;
		}
	}

}
