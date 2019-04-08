	FIRST REPEATING CHARACTER
Find the first charatcter that repeats

Hashing:

as you go through the string -> use stringbuilder
geeksforgeeks -> g 
g : 0, e : 1, k : 3,  s : 4, f: 5, o : 6, r : 7

return character

difference between positions > 0:
that character is the result
if the repeating character is  


import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
    		Scanner s = new Scanner(System.in);
    		int t = Integer.parseInt(s.nextLine());
    		for(int a = 0; a <= t; a++)
    		{
      			String str = s.nextLine();
      			char[] ch = str.toCharArray();
      			int n = str.length();
      			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      			for(char c: ch)
      			{
        			map.put(c,str.indexOf(c));
      			}
      			boolean flag = false;
      			char var = '\0';
      			for(int i = 0; i < n; i++)
      			{
        			if(map.containsKey(str.charAt(i)))
        			{
          				if(i - map.get(str.charAt(i)) > 0)
          				{
            					var = str.charAt(i);
            					flag = true;
            					break;
          				}
        			}
      			}
      			if(flag)
      			{
        			System.out.println(var);
      			}
      			else
      			{
        			System.out.println("-1");
      			}
    		}
  	}
}



Time complexity: O(n)
