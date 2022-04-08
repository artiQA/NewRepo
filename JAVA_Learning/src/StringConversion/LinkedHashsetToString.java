package StringConversion;

import java.util.LinkedHashSet;

public class LinkedHashsetToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String to linkedHashset
		String str="AdvikaA";
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
			
		}
		System.out.println(set);
		//LinkedHashSet to array
		Character a[]=new Character[set.size()];
		a=set.toArray(a);
		for(Character ch:a) {
			System.out.print(ch);
			
		}
		
		//LinkedHash set to string
		StringBuffer sb =new StringBuffer();
		for(Character s:set) {
			sb.append(s);
		
		}
		System.out.println(sb);
		
		//Reverse the string
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
