// Max API for stack
// How to create a class and add attributes

private static class ElementWithCachedMax
{
	private Integer element;
	private Integer max;
	public ElementWithCachedMax(Integer element, Integer max)
	{
			this.element = element;
			this.max= max;
	}
	
}

public static class Stack
{
	private Deque<ElementWithCachedMax> ElementWithCachedMax = new LinkedList<>();
	
	public boolean empty()
	{
		return ElementWithCachedMax.isEmpty();
	}
	public int pop()
	{
		if(empty())
		{
				return Nullpoonterexception;
		}
		return ElementWithCachedMax.removeFirst().element;
	}
	public int push(Integer x)
	{
		ElementWithCachedMax.addFirst(new ElementWithCachedMax(x,Math.max(x,empty() ? x: max())));
	}
	public int max()
	{
		if(empty())
		{
			throw errorexception
		}
		return ElementWithCachedMax.peek().max;
	}
}

// ex : of ElementWithCachedMax : (e,max), (e,max)


	
