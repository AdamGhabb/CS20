import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);

		int x = 5;
		double y = 6.7;
		char m = 'A';
		String name = "Vigor";
		
		final double PI = 3.14;
		

		System.out.println("X + X =" + (x + x));
		System.out.println("Enter an integer: ");//Prompting for an int
		int numEntered = userinput.nextInt();//Recording an int


		System.out.println("The integer you have entered is: " + numEntered);

		
		System.out.println("Please type Y/N");
		char ans = userinput.next().charAt(0);
		
		if(ans == 'Y')
		{
		System.out.println("Great lets move on");
		}
		else
		{
		System.out.println("Oh okay sorry");
		}
	}

}
