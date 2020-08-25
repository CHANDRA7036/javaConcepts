package samples;

public class RacingCar implements CarInterface {
	
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
//	    public String speed;
//	    public int seatingCapacity;
//	    public String brand;
//	    protected String licensePlate = null;
//	    //public String modelName;
//	    //override the modelName;
//	    public String modelName="Race";
//	 
//	    public void setLicensePlate(String licensePlate) {
//	        this.licensePlate = licensePlate;
//	        System.out.println("License plate"+this.licensePlate);
//	    }
//	    
//	    public void lights(int lights) {
//	    	System.out.println("Racing car Lights"+lights );	
//	    }
//	    public void mirrors(int mirrors) {
//	    	System.out.println("Racing car mirrors"+ mirrors);	
//	    }
//	  
//	    public static void main(String[]args) {
//	    	RacingCar rc=new RacingCar();
//	    	//method is in private
//	    	//rc.basicProperties("2lakh");
//	    	
//	    	rc.similarFeatures();
//	    	rc.setLicensePlate("123");
//	    	
//	    	rc.mirrors(10);
//	    	rc.setDoors(4);
//	    	rc.setWheels(4);
//	    	rc.setNoOfGears(5);
//	    	rc.speed="200kmph";
//	    	rc.seatingCapacity=1;
//	    	rc.brand="ABCD";
//	    	 System.out.println(rc.brand);
//	    	 System.out.println(rc.modelName);
//	    }
}
