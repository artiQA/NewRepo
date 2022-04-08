package Java_basic_package;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		
		String str[] = new String[set.size()];
		str=set.toArray(str);
		for(String a:str) {
			System.out.print(a);
		}
	
		
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		set1.add('a');
		set1.add('b');
		set1.add('c');
		
		StringBuilder br1=new StringBuilder();
		
		for(char ss:set1) {
			br1.append(ss);
		}
		System.out.print(br1);
			
		
		StringBuilder br2=new StringBuilder();

		//Iterator i =set1.iterator();
		for(char ss:set1) {
			br2.append(ss);
		}
		System.out.print(br2);

		
	}

}
