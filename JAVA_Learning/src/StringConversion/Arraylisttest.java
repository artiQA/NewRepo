package StringConversion;

import java.util.ArrayList;

public class Arraylisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;    
		String str = "He said, ?The mailman loves you.?I heard it with my own ears.";    
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('!');
		al.add(',');
		al.add(',');
		al.add(';');
		al.add('?');
		al.add(':');
		for(int j=0;j<str.length();j++) {

		for(int i=0;i<al.size();i++) {
			if(str.charAt(j)==al.get(i)) {
				count++;
				System.out.println(str.charAt(j));
			}
    
		}    

	}
		System.out.println("The number of punctuations exists in the string is: " +count);    

		  String string = "The best of both worlds";    
	        int count1 = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count1++;    
	        }    
	        System.out.println(count1);
}
}
