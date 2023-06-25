package pack.Utility;

import java.util.Scanner;
import java.text.NumberFormat;
import pack.Employee.*;
import pack.Utility.calculations;

interface services_interface{
	void viewCalculatedSalary(int rate, int hours_worked);
	void payEmployee();
}

abstract class services_abstract implements services_interface{}

public class services extends abstraction{
	Scanner scan = new Scanner(System.in);


	//method to put a comma in an integer
	//to make it thousands
	public String formatInteger(int toFormat){
		return NumberFormat.getIntegerInstance().format(toFormat);
	}

	//method to display the calculated salary
	public void viewCalculatedSalary(int rate, int hours_worked){
		calculations calc = new calculations(rate, hours_worked);
		System.out.println("SALARY DEDUCTION");
		System.out.println("PhilHealth (5%) : Php" + 
								formatInteger(calc.getPhilHealthDeduction()));

		System.out.println("SSS (3%) : Php" + 
								formatInteger(calc.getSSSDeduction()));

		System.out.println("PAG-IBIG (2%) : Php" + 
								formatInteger(calc.getPagIbigDeduction()));

		System.out.println("---------------------------------------");
		System.out.println("GROSS SALARY : Php" + 
								formatInteger(calc.getGrossSalary()));

		System.out.println("TOTAL DEDUCTION : Php" + 
								formatInteger(calc.getTotalDeduction()));

		System.out.println("NET SALARY : Php" + 
								formatInteger(calc.getNetSalary()));
	}


	//method for the main display
	public void payEmployee(){
		System.out.println("==============||PAY EMPLOYEE||==============");
		System.out.print("Employee ID : ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.print("Employee Name : ");
		String name = scan.nextLine();
		System.out.print("Status : ");
		String status = scan.nextLine();

		//If the status is part time
		//will call the partTimeEmployee class
		if (status.equalsIgnoreCase("part time")) {
			System.out.print("Hours Worked : ");
			int hours_worked = scan.nextInt();

			System.out.println("---------------------------------------");
			partTimeEmployee pt = new partTimeEmployee(name, id, hours_worked);
			pt.display();
			System.out.println("---------------------------------------");
			viewCalculatedSalary(pt.getRate(), hours_worked);

		}

		//If the status is full time
		//will call the fullTimeEmployee class
		else if (status.equalsIgnoreCase("full time")) {
			System.out.print("Days Worked : ");
			int days_worked = scan.nextInt();

			System.out.println("---------------------------------------");
			fullTimeEmployee ft = new fullTimeEmployee(name, id, days_worked);
			ft.display();
			System.out.println("---------------------------------------");
			viewCalculatedSalary(ft.getRate(), days_worked);
		}
	}
}