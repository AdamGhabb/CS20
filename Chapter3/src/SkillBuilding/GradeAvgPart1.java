package SkillBuilding;

import java.util.Scanner;

public class GradeAvgPart1 {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		
		
		float grade1;
		float grade2;
		float grade3;
		float grade4;
		float grade5;
		float gradetotal;
		float gradeavg;
		
		System.out.println("What is your first grade: ");
		
	    grade1 = userinput.nextFloat();
		
	    System.out.println("What is your second grade: ");
		
	    grade2 = userinput.nextFloat();
		
	    System.out.println("What is your third grade: ");
		
	    grade3 = userinput.nextFloat();
		
	    System.out.println("What is your fourth grade: ");
		
	    grade4 = userinput.nextFloat();
	    
	    System.out.println("What is your fifth grade: ");
		
	    grade5 = userinput.nextFloat();
	    
	    gradetotal = grade1 + grade2 + grade3 + grade4+ grade5;
	    
	    gradeavg = gradetotal / 5;
	    
	    System.out.println("Your grade average is: " + gradeavg);
		
	}

}
