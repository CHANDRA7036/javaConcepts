package javaBasics.sample;

public class ifElseIf {
	public static void main(String[]args) {
		int marks=62;
		if(marks>=75){
			System.out.println("Good");
		}else if(marks>=60){
			System.out.println("Avg");
		}else if(marks>=50){
			System.out.println("Below Avg");
		}else {
			System.out.println("Fail");
		}
	}
}
