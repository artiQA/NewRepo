package interfaceTest;

public interface interfaceTest {
	
	String str = "";
	void testnew(String s);
	
	
	static void methodstatic() {
		System.out.println("Interface static");
	}
	
	default void methoddefault() {
	}
	
}
