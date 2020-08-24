package samples;
class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk and run");
	   }
	}

public class Override1 {
	 public static void main(String args[]) {
	 Animal a = new Animal();   // Animal reference and object
     Animal b = new Dog(); 
     a.move();
     b.move();
	 }
}
