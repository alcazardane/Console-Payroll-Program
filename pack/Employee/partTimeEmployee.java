package pack.Employee;

public class partTimeEmployee extends employee{
	int rate_per_hour, working_hours;

	public partTimeEmployee(String name, int id, int working_hours){
		super(name, id);
		this.working_hours = working_hours;
		this.rate_per_hour = 45;
	}

	//method to display the output
	//overriding the display method of the super class
	public void display(){
		System.out.println("EMPLOYEE STATUS");
		super.display();
		System.out.println("Status : Part Time");
		System.out.println("Working Hours : " + working_hours);
		System.out.println("Rate Per Hour : " + rate_per_hour);
	}

	//method to encapsulate the rate_per_hour variable
	public int getRate(){
		return rate_per_hour;
	}
}