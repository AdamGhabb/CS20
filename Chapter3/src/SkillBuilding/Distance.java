package SkillBuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
/*
 * DecimalFormat dc = new DecimalFormat("0.00");

        double firstseg1 =12.2;
		double secondseg1 =10.6;
		double thirdseg1 =5.8;
		double total1;
		
		total1 = firstseg1 + secondseg1 + thirdseg1;
		System.out.println("Total race distance: " + dc.format(total1));
 
 */
		
		float firstseg;
		float secondseg;
		float thirdseg;
		float total;
		


		
		System.out.println("How long is the first segment?");
		
		firstseg = userinput.nextFloat();
		
		System.out.println("How long is the second segment?");
		
		secondseg = userinput.nextFloat();
		
		System.out.println("How long is the third segment?");
		
		thirdseg = userinput.nextFloat();
		
		total = firstseg + secondseg + thirdseg;
		
		System.out.println("the total amount is " + total);
		
	}

}
