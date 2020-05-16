package may2020;

public class OddEvenLinkedList {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode odd = head, even = head.next, t = head.next;
        if(even == null){
            return head;
        }
        while(even.next != null && even.next.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        if(odd.next.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
        }
        odd.next = t;
        even.next = null;
        return head;
    }

}
