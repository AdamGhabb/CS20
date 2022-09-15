import java.util.Scanner;

public class Testing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput = new Scanner(System.in);
		
		int age;
		double salary;
		String name;
		//char FirstInitial;

		System.out.println("Please enter your full name: ");
		
		name = userinput.nextLine();
		
		System.out.println("The name you have entered is: " + name);
		
		System.out.println("Please enter your age: ");
		
		
		age = userinput.nextInt();
		
		
		System.out.println("The name you have entered is: " + age);
		
		System.out.println("Please enter your Salary: ");
		
		
		salary = userinput.nextLong();
		
		
		System.out.println("The Salary you have entered is: " + salary);
	}

}
