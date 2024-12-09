package triangledrawApp;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		
		System.out.println("Welcome to my Triangle Drawing App\n\n\n");
		
		do 
		{
		System.out.print("Please enter how many rows you would like: ");
		int rows = scanner.nextInt();
		for(int i = 1; i <= rows; i++) 
		{
			for(int j = 1; j <= i; j++) 
			{
				System.out.print("");
			}
			for(int k = 1; k <=i; k++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
			
		System.out.print("Go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
