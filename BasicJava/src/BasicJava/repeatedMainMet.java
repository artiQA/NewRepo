package BasicJava;
public class repeatedMainMet {
	 
	public static void main(String[] args) {
        
        String inputstring = "Krishna";
        String revword = "";
        char[] chars = inputstring.toCharArray();
        int length = chars.length;
         
        for (int i = length-1; i >=0; i--) {
            revword = revword+inputstring.charAt(i);
            System.out.println(revword);
        }
        System.out.println(revword);
        
	}
 
}