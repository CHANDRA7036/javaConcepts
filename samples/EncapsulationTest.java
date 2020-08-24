package samples;



public class EncapsulationTest {
	public static void main(String[]args) {
		Encapsulation en=new Encapsulation();
		en.setAge(23);
		en.setName("Ashok");
		System.out.println("name"+ en.getName());
		System.out.println("age:"+en.getAge());
	}

}
