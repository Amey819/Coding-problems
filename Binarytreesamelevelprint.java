// Print all nodes at the same level in a binary tree


public static List<List<Integer>> Samelevel(BinaryTreeNode n)
{
	// data structures
	Queue<BinaryTreeNode<Integer>> currdepth = new LinkedList<>();
	List<List<Integer>> result = new Arraylist<>;
	currdepth.add(n);
	while(!currdepth.isEmpty())
	{
		Queue<BinaryTreeNode<Integer>> nextdepth = new LinkedList<>();
		List<Integer> thislevel = new ArrayList<Integer>();
		while(!currdepth.isEmpty())
		{
			BinaryTreeNode<Integer> curr = currdepth.poll();
			if(curr != null)
			{
				thislevel.add(curr.data); // adds to the temporary array
				if(curr.left != null)
				{
					nextdepth.add(curr.left); // adds left node to nextdepth
				}
				if(curr.right != null)
				{
					nextdepth.add(curr.right); // adds right node to nextdepth
				}
			}
		}
		if(!thislevel.isEmpty())
		{
			result.add(thislevel);
		}
		currdepth = nextdepth;
	}
	return result;
 	
	
	
}