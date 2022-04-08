package Java_basic_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

class test2{  
	
		ArrayList <Character> al;
		static int count;
		test2() {
			al= new ArrayList<Character>();
			al.add('a');
			al.add('e');
			al.add('i');
			al.add('o');
			al.add('u');
			
		}
		public boolean vowelboolean(char c) throws ArithmeticException{
			for(int i=0;i<al.size();i++) {
			if(c==al.get(i)) {
				System.out.println(c);
				return true;
			}
			
			
			}
			return false;
		}
		
		public int vowelcount(String str)  {
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				boolean status = vowelboolean(c);
				//System.out.println(status);
				if(status==true) {
					count++;
					//System.out.println(count);
					
				}
			}
			return count;
			
		}
	
	   public static void main(String args[])  
	    {   
		   String str1 = "Hello";  
	        String str2 = "Javatpoint";  
	        String str3 = "Reader";  
	        Integer int1 = new Integer(55);
	        // Concatenating Space among strings  
	        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);  
	        System.out.println(str4);         
	        // Concatenating Special Chars        
	        String str5 = str1.concat("!!!");  
	        System.out.println(str5);         
	        String str6 = str1.concat("@").concat(str2);  
	        System.out.println(str6);  
	        int i =99;
	        String joinString1=String.join("","welcome","to","javatpoint");  
	        System.out.println(joinString1);  
	        System.out.println(String.valueOf(i));
	        
	        System.out.println(String.valueOf(int1));
	        String str = "This is index of example";  
	        int index = str.lastIndexOf('s',5);  
	        System.out.println(index); 
	        String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
	        String replaceString=s1.replaceAll("me","was");//replaces all occurrences of "is" to "was"  
	        System.out.println(replaceString);  
	        String s1a="welcome to split world";  
	        System.out.println("returning words:");  
	        for(String w:s1a.split("\\s",0)){  
	        System.out.println(w);  
	        }  
	        System.out.println("returning words:");  
	        for(String w:s1a.split("\\s",1)){  
	        System.out.println(w);  
	        }  
	        System.out.println("returning words:");  
	        for(String w:s1a.split("\\s",2)){  
	        System.out.println(w); 
	        
	        String eng = s1.toLowerCase(Locale.GERMAN);  
	        System.out.println(eng);
	        String s12 = "Welcome to Javatpoint";  
	        char[] ch = s12.toCharArray();  
	        int len = ch.length;  
	        System.out.println("Char Array length: " + len);  
	        System.out.println("Char Array elements: ");  
	        for (int i11 = 0; i11 < len; i11++) {  
	           // System.out.println(ch[i11]);  
	        }  
	        } 
	    }          
				 
}