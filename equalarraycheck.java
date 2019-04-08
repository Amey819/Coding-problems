Check if arrays are equal or not

Given two arrays check if both elements contain same elements

Put all the elements of first array in Hashset

run through second array and check if all


[1,2,3,5,5,6]
[5,3,2,6,1]  --> not equal

associate a count with all elements in array
run through array2 and check if element is present in the hashmap

if yes -> true
else no

go through all the elements and put in a hashmap with a boolean value
create two hashmaps with element and count 
check if every element in array2 keyset is present in hashet1 if true then check if .get() matches
/*package whatever //do not write package name here 
*/


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
           
	for(int a =0 ; a < t ; a++)
	    
		{
	        
			HashSet<Integer> set = new HashSet<Integer>();
	        
			int m = s.nextInt();
	        
			int[] arr1 = new int[m];
	        
			int[] arr2 = new int[m];
	        
			for(int j = 0; j < m; j++)
	        
			{
	            
				arr1[j] = s.nextInt();
	            
				set.add(arr1[j]);
	        
			}
	        
			for(int k = 0 ; k < m; k++)
	        
			{
	            
				arr2[k] = s.nextInt();
	        
			}
	        
			int count = 0;
	        
			for(int i = 0 ; i < m; i++)
	        	
			{
	            	
				if(!set.contains(arr2[i]))
	            
				{
	                
					System.out.println("0");
	                
					break;
	            
				}
	            
				else
				{
	                
					count += 1;
	            	
				}
	        
			}
	        
			if(count == m)
	        
			{
	            
				System.out.println("1");
	        
			}
	           
	    
		}
	
	}

}
