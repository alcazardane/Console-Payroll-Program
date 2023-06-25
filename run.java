import java.util.Scanner;
import pack.Utility.services;

public class run{

	public static void forRequirements(String display){
		System.out.println("For Requirements : Alcazar");
	}
	public static void forRequirements(int display){
		System.out.println("For Requirements : 01000001 01101100 01100011 01100001 01111010 01100001 01110010");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		services serve = new services();
		int choice = 2;
		do{
			serve.payEmployee();
			System.out.println("[1] EXIT    [2] REPEAT");
			System.out.print("Your choice : ");
			choice = scan.nextInt();
		}while(choice == 2);

		if (choice == 1) {
			System.out.println("\nHAVE A GREAT DAY");
			forRequirements("String");
		}
	}
}