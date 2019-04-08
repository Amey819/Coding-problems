// Run length encoding

int start = 0;
StringBuilder result = new StringBuilder();
aaaabcccaa
for(int i = start; i < s.length() ; i++)
{
	int end = start + 1;
	int count = 1;
	for(int j = end ; j  < s.length() - 1; j++)
	{
		if(s.charAt(j) != s.charAt(i))
		{
			result.append(count);
			result.append(s.charAt(i));
			start = end;
			break;
		}
		else{
			count += 1;
			if(end == s.length() - 1)
			{
				result.append(count);
				result.append(s.charAt(i));
				return result.toString;
			}
	}
	return result.toString();
}