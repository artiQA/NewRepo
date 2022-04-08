package testpurpose;

public class stringliterals {
	
	String s1="test";
	String s2="test";
	String s3 = new String("test");
	String s4 = new String("test");
	
	public void stringmethod() {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);


	}
	public static void main(String[] args) {
		stringliterals s= new stringliterals();
		s.stringmethod();
	}

}
