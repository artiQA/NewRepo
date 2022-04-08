package Java_basic_package;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
	static int i;

	public static void main(String args[]) {
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		System.out.println(set);
		String[] str = new String[set.size()];
		str=set.toArray(str);
		for(String abc:str) {
			System.out.print(abc);
		}
		
	}
	}