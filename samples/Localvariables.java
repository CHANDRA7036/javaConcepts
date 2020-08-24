package samples;

public class Localvariables {
	  public void method1() {
	      int age = 0;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
		   Localvariables test = new Localvariables();
	      test.method1();
	   }

}
