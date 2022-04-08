package Java_basic_package;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class helo {
	String st;
	String c1;

	public void dupl(String str) {
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		StringBuilder br = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			ch.add(str.charAt(i));

			}		
    	Iterator itr=ch.iterator();
    	for(char cb:ch) {
    		br.append(cb);
    	}
		System.out.println(br);

		}
	//	System.out.println(st);

	 public static String toString(char[] a)
	    {
	        // Creating an object of String class
	        String string = String.valueOf(a);
	 
	        return string;
	    }

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		helo h1=new helo();
		h1.dupl("Hello Worldeessss");
		//System.out.println(s1);

	}

}
