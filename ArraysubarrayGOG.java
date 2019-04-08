

/*package whatever 
//do not write package name here */


import java.util.*;

import java.lang.*;

import java.io.*;


class GFG 
{
	
	public static void main (String[] args) 
	{

		//code
		
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
			
		for(int a = 0 ; a < t; a++)
	    
		{
	        
			int m = s.nextInt();
	        
			int n = s.nextInt();
	        
			int arr1[] = new int[m];
	        
			int arr2[] = new int[n];
	        
			HashSet<Integer> set = new HashSet<Integer>();
	        
			for(int i = 0 ; i < m; i++)
	        
			{
	            
				arr1[i] = s.nextInt();
	            
				set.add(arr1[i]);
	        
			}
	        
			for(int i = 0; i < n; i++)
	        
			{
	            
				arr2[i] = s.nextInt();
	        
			}
	        
			int count = 0;
	
		        for(Integer i : arr2)

		        {

	            
		if(set.contains(i))

			        {
		
	                count += 1;
		
	        }
	
	        }
	        
			if(count == n)
	        
			{
	            
				System.out.println("Yes");
	
	        }
	
	        else
	        
			{
	           
				 System.out.println("No");
	
	        }
	    
		}
	
	}

}