package testtt;

public class testClass {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		largestNumber(arr);

	}

	
	private static void largestNumber(int[] arr) {
		int max1, max2,i;
		int n=arr.length;
		max1=max2=0;
		for(i=0; i<n; i++) 
		{
		if(arr[i] > max1) 
		{
		max2 = max1;
		max1 = arr[i]; 
		} else
		if(arr[i] > max2 && arr[i] < max1)
		{ 
		max2 = arr[i]; 
		} 
		} 
		double result =max1+max2;
		System.out.println(result);
		
	}

}
