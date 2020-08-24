package javaBasics.sample;

import java.util.Scanner;

public class AddTwoNumbersScanner {
	public static void main(String[]args) {
		int sum1,sum2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		sum1=sc.nextInt();
		System.out.println("Enter Secound Number");
		sum2=sc.nextInt();
		sum=sum1+sum2;
		System.out.println(sum);
	}

}
