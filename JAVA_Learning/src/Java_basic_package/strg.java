package Java_basic_package;

public class strg {
	
	public static void main(String[] args) {
		
		String inputStr ="testeer";

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            
        }
        }
}
	
}
