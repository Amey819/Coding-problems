public static ListNode<Integer> mergetwolists(LstNode<Integer> L1, ListNode<Integer> L2)
{
		ListNode<Integer> dummy = new ListNode<>(0,null);
		ListNode<Integer> current = dummy;
		ListNode<Integer> p1 = L1;
		ListNode<Integer> p2 = L2;
		
		while( p1 != null && p2 != null)
		{
			if(p1.data <= p2.data)
			{
				current.next = p1.data;
				p1 = p1.next;
			}
			else{
				current.next = p2.data;
				p2 = p2.mext;
			}
			current = current.next; // increment the List
		}
		current.next = p1 != null ? p1 : p2; // append the remaining node to the end
	return dummy.next; // O(n+m) time complexity
	// O(1) space cause everything is append to just 1 node and it calls one node at a time
}