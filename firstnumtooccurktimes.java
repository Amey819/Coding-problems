First element to occur k times:
appears first and have frequency k

1
7 2
1 7 4 3 4 8 7

Create a hashmap with integer,position
Create another hashmap with <Integer,Boolean>


go through all the elements in the array
/*package whatever //do not write package name here 
*/


import java.util.*;

import java.lang.*;

import java.io.*;

import java.util.*;

class GFG 
{
	
public static void main (String[] args) 
{
		
//code
		
	Scanner s = new Scanner(System.in);
	
	int t = s.nextInt();
		
	for(int a = 0; a < t; a++)
		
	{
		    
		int m = s.nextInt();
		    
		int k = s.nextInt();
		    
		int[] arr = new int[m];
		    
		for(int i = 0; i < m; i++)
		    
		{
		        
			arr[i] = s.nextInt();
		    
		}
		    
		// Used Likedhashmap to get the elements out in the same order they were inserted
		    
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
    		
		for(int i = 0; i < m; i++)
            
		{
    	        
			if(map.containsKey(arr[i]))
    	        
			{
    		        
				int x = map.get(arr[i]);
    		        
				x += 1;
 
	   		        map.put(arr[i],x);
    	        
			}
    	        
			else
    	        
			{
    	            
				map.put(arr[i],1);
    	        
			}
            
		}
            
		int count = 0;
            
		for(Integer e: map.keySet())
            
		{
	            
			if((map.get(e)) == k )
		        
			{
		            
				System.out.println(e);
		            
				break;
		        
			}
		        
			count += 1;
		    
		}
		    
		if(count == map.size())
		    
		{
		        
			System.out.println("-1");
	
	 }
		
	}
    
	}

}
