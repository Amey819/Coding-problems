// valid ip addresses

// 19216811
// how to divide it
// 1234   -> 1.2.3.4   123.0.0.4
int cols = s.length();
int rows = 3;
char[][] ch = new char[rows][cols];
for(int i = 0; i < rows ; i ++)
{
	if(i == 0)
	{
		for(int j = 1; j < cols; j += 4)
		{
			ch[i][j] = s.charAt(j);
		}
	}
	else if(i == 1)
	{
		for(int j = 0 ; j < cols; j += 2)
		{
			ch[i][j] = s.charAt(j);
		}
	}
	else
	{
		for(int j = 3; j < cols; j += 4)
		{
			ch[i][j] = s.charAt(j);
		}
	}
}