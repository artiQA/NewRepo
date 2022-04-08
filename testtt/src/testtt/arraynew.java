package testtt;

import java.util.LinkedHashSet;

public class arraynew {
 

	
	public static void main(String[] args) {
    	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		int [] arr = new int [] {1,2,3,1,2,3,1,2,1,1};   
		
		
        System.out.println("count elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
        	set.add(arr[i]);
        }
        
        int[] cnt = new int[set.size()];
        int[] elements = new int[set.size()];
        int a = 0; int b=0;
        for (Integer i: set) {
        	elements[a++] = i;
        	cnt[b++]=0;
        }
        
        for(int i = 0; i < arr.length; i++) {  

        	for(int j = 0; j < elements.length; j++) {  
        		
        		if(elements[j]==arr[i]) {
        			cnt[j]=cnt[j]+1;
        		}
        		
        	}
                	
        }  
           
        for(int i = 0; i < elements.length; i++) {  
    		
        	System.out.println(" count of "+elements[i]+" is "+cnt[i]);
    		
    	}
          
        
    }  

	

}