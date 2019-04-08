public static List<Integer> nextperm(List<Integer> perm)
{
	int k = perm.size()- 2;
	// start from the right
	while( k  >= 0 && perm.get(k) > perm.get(k+1))
	{
		k--;
	}
	if(k == -1)
	{
		return Collections.emptyList();
	}
	// stop if p[k] < p[k+1]
	// then find the smallest element greater than p[k] in sublist(A,k+1,end)
	for(int i = perm.size() ; i > k; i--)
	{
		if(p[i] > p[k])
		{
			// swap the two elements
			Collections.swap(perm,k,i);
			break;
		}
	}	
	// now rverse all the elements from k+1 to end to get the smallest element greater than the given permuation
	Collections.reverse(perm.subList(k+1,perm.size()));
	return perm;
}