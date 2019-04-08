
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
		
		for(int a =0; a < t; a++)

		{
		    
			int n = s.nextInt();
   
		        int m = s.nextInt();

              	        int x = s.nextInt();

		        int[] arr1 = new int[n];
            
		int[] arr2 = new int[m];
	
	        	HashSet<Integer> set = new HashSet<Integer>();
	
	          	for(int i = 0 ; i < n; i++)
		    
			{

		        	arr1[i] = s.nextInt()
		        
		    
			}

		        for(int i = 0; i< m; i++)

		        { 
		        
				arr2[i] = s.nextInt();
	
		        set.add(arr2[i]);
		    
			}
	
		    // find all pairs having sum equal to x

		        Map<Integer,Integer> treemap = new TreeMap<Integer,Integer>();
	
               	        for(int i = 0; i < n ;i++)
		    
			{
		        
				if(set.contains(x - arr1[i]))
		        
				{
		            
					treemap.put(arr1[i],x - arr1[i]);
		        
				}
		   
			}
		    
			for (Integer name: treemap.keySet())
		    
			{
                
				String key =name.toString();
                
				String value = treemap.get(name).toString();
	        
                System.out.print(key + " " + value +", ");  
		    
			}
		    
		
  		}
	
	}	

}