// Print the jump-first-order
// it means if  a node has a jump node then it will first explore all the jumps before going to its next



public static void Getorder(PostListings L)
{
	setorderforlist(L,0);
}

private static int setorderlist(PostListings L, int order)
{
	// Recursive approach
	// check if the node has jump and it is not null
	// keep a L.order to check if it has been visited
	// if yes -> then go on ahead
	// else return to visit its next node
	
	if(L != null && L.order == -1)
	{
		L.order  = order++;
		order  = setorderlist(L.jump,order);
		order = setorderlist(L.next,order);
	}
	return order;
}