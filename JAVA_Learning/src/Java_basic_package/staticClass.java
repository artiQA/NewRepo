package Java_basic_package;

import java.lang.reflect.Array;

public class staticClass {
	
	static {
		System.out.println("Static passs");
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		for(int s:a) {
		System.out.println(s);
		}
		a[2]=14;
		for(int s:a) {
		System.out.println(s);
		}
		
	}
}
