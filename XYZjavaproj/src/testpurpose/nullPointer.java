package testpurpose;

public class nullPointer {
	
	static String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(str!=null) {
		System.out.println(str.length());
		}
		else {
			System.out.println("no null");
		}
	}

}
