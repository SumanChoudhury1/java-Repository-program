package example_demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year : ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if((s % 400 == 0)||(s % 4 == 0 && s % 100!= 0)) {
			 System.out.println(" Leap Year : ");
		}
		else {
			System.out.println("Not  Leap Year : ");
		}
	}

}
