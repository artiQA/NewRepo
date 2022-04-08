package testtt;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class arrduplicate {
 

	
	public static void main(String[] args) {
    	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		int count=0;
		int [] arr = new int [] {1, 2, 3, 1, 2, 3, 1, 2, 3};   
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
        	set.add(arr[i]);

            for(int j = i + 1; j < arr.length; j++) {  

                if(arr[i] == arr[j])  
                	count;
                	System.out.println(arr[i]+ "+" +count);
            }  
            System.out.println("count of" +arr[i]+ "is" +count);  


        }  
        for(Integer i1:set) {
           // System.out.println("count of" +i1+ "is" +count);  

        	
        }
    }  

	

}

