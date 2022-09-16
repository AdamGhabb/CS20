package SkillBuilding;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		
		int firstD;
		int secondD;
		int Digits;
		
		System.out.println("write down two digits:");
		
		Digits = userinput.nextInt();
		
		firstD = Digits / 10;
		
		System.out.println("digit one:" + firstD );
		
        secondD = Digits % 10;
		
		System.out.println("digit two: " + secondD );
		
		
		
	}

}
