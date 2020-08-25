package samples;

public class VintageCar extends NormalCar {
	
	   public void setLicensePlate(String number)
	   {
	      System.out.println("Number Plate:"+number);
	   }

	   public void wheels(int wheels)
	   {
		   System.out.println("Number Of Wheels:"+wheels);
	   }

	public void gears(int gears) {
		 System.out.println("Number Of Gears:"+gears);
		
	}
	
	public void lights(int lights) {
		 System.out.println("Number Of Lights:"+lights);
		
	}

	public void doors(int wheels) {
		 System.out.println("Number Doors:"+wheels);
		
	}
	
	
//	public String speed;
//	public int noOfGear;
//	public String brand;
//	public String modelNumber;
//	
//	public static void main(String[] args) {
//		VintageCar v= new VintageCar();
//		v.similarFeatures();
//		
//	}

}
