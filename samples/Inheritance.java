package samples;

public class Inheritance {
	public void method1() {
		System.out.println("hii I am method1 from parent");
	}
	
	public void method2() {
		System.out.println("hii I am method2 from parent");
	}
	
	public void method3() {
		System.out.println("hii I am method3 from parent");
	}

}

class Child extends Inheritance{
	public void method5() {
		System.out.println("I am from Child5");
	}
	public void method6() {
		System.out.println("I am from Child6");
	}
}