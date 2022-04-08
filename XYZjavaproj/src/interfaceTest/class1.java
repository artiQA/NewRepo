package interfaceTest;

public class class1 implements interfaceTest {

	@Override
	public void testnew(String s) {
		// TODO Auto-generated method stub
		System.out.println("testnew abstract method");
		
	}
	
	static void methodstatic() {
		System.out.println("class static");
		
	}
	public static void main(String[] args) {
		class1 cls = new class1();
		cls.testnew("test");
		methodstatic();
		cls.methoddefault();
	}

}
