// Reverse a Linked List

// 
public static ListNode<Integer> Reverse(ListNode L1)
{
	LinkedList<Integer> Node = new LinkedList<>(0,null);
	ListNode<Integer> prev = Node;
	ListNode current = L1;
	while(curr.next != null)
	{
		ListNode<Integer> next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
	}
	return Node;
}