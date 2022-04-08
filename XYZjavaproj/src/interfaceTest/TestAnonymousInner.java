package interfaceTest;

 class TestAnonymousInner {
	
	public static void main(String args[]){  
		  Person<Integer> p=new Person<>(){

			@Override
			void eat() {
				// TODO Auto-generated method stub
				
			}  
		  
		  };  
		  p.eat(1, 2);  
		 }  

}
