package testpurpose;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
	
	
	int arr[] = { 10, 20, 5,4, 20, 10, 10, 20, 5, 20,11 };
	//Map<Integer, Integer> mp = new HashMap<Integer,Integer>();
	Map<Integer,Integer> mp= new HashMap<Integer,Integer>();
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" is now "+mp.get(arr[i]));

		if (mp.containsKey(arr[i])) {
		System.out.println(arr[i]+" is "+mp.get(arr[i])+ "AND" +(mp.get(arr[i]) + 1));
	mp.put(arr[i], mp.get(arr[i]) + 1);
	} else {
	mp.put(arr[i], 1);
		}}
	// Traverse through map and print frequencies
	for (Map.Entry<Integer, Integer> entry : mp.entrySet()) 
	{ 
		if(entry.getValue()>1)
		System.out.println("Element:"+entry.getKey() + " " + "Count:"+entry.getValue());
	
	}
	
}
}
	



