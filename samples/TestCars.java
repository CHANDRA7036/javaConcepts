package samples;

public class TestCars {
	public static void main(String[]args) {
		NormalCar nc=new NormalCar();
		nc.doors(5);
		nc.gears(5);
		nc.lights(10);
		nc.wheels(4);
		nc.setLicensePlate("12345");
	}
}
