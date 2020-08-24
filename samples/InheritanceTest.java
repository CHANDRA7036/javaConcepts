package samples;

public class InheritanceTest {
	public void test1(){
		System.out.println("hii I am test");
	}
	public static void main(String args[]){
	InheritanceTest in=new InheritanceTest();
	in.test1();
	
	Child c = new Child();
	c.method1();
	c.method5();
	
	Inheritance p1 = new Child();
	p1.method1();
	p1.method2();
	
	// Child c1 = new Inheritance();

	}
	
}
