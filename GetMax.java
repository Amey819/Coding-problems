// Stack to find max also along with push and pop


public static max(ListNode head)
{
	LinkedList<Integer> stack = new LinkedList<>();
	int max = head.data;
	while(head != null)
	{
		stack.push(head);
		if(head.data > max)
		{
			max = head.data;
		}
		head = head.next;
	}
	return max;
	// add elements to the stack
	// while adding keep a amax counter to track the max
	// return the max
}