package StringConversion;

public class newClass {
	
	static String s1 = "123";
	static int result =0;
	static String OutputStr="";
	public static void main(String[] args) {
		

		for(int i=0;i<s1.length();i++) {
			
			String S = Character.toString(s1.charAt(i));
			if(isNumeric(S)) {
				result=result+Integer.parseInt(S);
        		if(OutputStr.length()==0)
        		{
        			OutputStr=OutputStr+i;
        		}else {
        			OutputStr=OutputStr+"+"+i;
        		}
        		
        		System.out.println("Result is: "+OutputStr+" : "+result);
        	}

			}
			
			}
		

	private static boolean isNumeric(String s) {
		// TODO Auto-generated method stub
		try {  
  		  int i1 = Integer.parseInt(s);  
  	    return true;
  	  } catch(NumberFormatException e){  
  	  }
		return false;  
	}
	}

	


