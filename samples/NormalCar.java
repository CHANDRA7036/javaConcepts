package samples;

public class NormalCar implements CarInterface {
	
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
	}

	
//	private int noOfGears;
//	private int wheels;
//	private int doors;
//
//	public String licensePlate = null;
//	public String modelName="Basic Model";
//
//	//Access modifiers
//	private void basicProperties(String price) {
//		System.out.println(price);
//		//local variables
//	    int nuts=100;
//	    int bolts=100;
//	    String typeCar="petrol";
//	}
//
//	public void setLicensePlate(String licensePlate) {
//	    this.licensePlate = licensePlate;
//	    System.out.println(this.licensePlate);
//	}
//
//	public void similarFeatures() {
//		System.out.println("Similar to All Cars ");
//	}
//
//	public int getNoOfGears() {
//		return noOfGears;
//	}
//	public void setNoOfGears(int noOfGears) {
//		this.noOfGears=noOfGears;
//	}
//
//	public int getWheels() {
//		return wheels;
//	}
//	public void setWheels(int wheels) {
//		this.wheels=wheels;
//	}
//
//	public int getDoors() {
//		return doors;
//	}
//	public void setDoors(int doors) {
//		this.doors=doors;
//	}
//
//	public static void main(String[]args) {
//		NormalCar c=new NormalCar();
//	c.basicProperties("3lks");
//	c.noOfGears=7;
//	c.setLicensePlate("Ap27");
//	//System.out.println(c.noOfGears);
//	}


