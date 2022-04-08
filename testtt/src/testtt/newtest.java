package testtt;

public class newtest {
	
	static String one="";
	static int i;
	static String str= "Imm am Arti";
	static String arr[]=str.split(" "); 
	//ar[0]= imm, arr[1]=am arr[2]=arti
	
	public static void reverse(String str) {
		   for(int i=0;i<arr.length;i++)
		      {

		          for(int j=arr[i].length()-1;j>=0;j--)
		          {   
		          System.out.print(arr[i].charAt(j));
		          }
		          System.out.print(" ");
		      }

    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse(str);
	

	}
	

}
