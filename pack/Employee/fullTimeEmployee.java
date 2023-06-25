package pack.Employee;

public class fullTimeEmployee extends employee{
	int rate_per_day, working_days;
	
	public fullTimeEmployee(String name, int id, int working_days){
		super(name, id);
		this.working_days = working_days;
		this.rate_per_day = 700;
	}

	//method to display the output
	//overriding the display method of the super class
	public void display(){
		System.out.println("EMPLOYEE STATUS");
		super.display();
		System.out.println("Status : Full Time");
		System.out.println("Working Days : " + working_days);
		System.out.println("Rate Per Day : " + rate_per_day);
	}

	//method to encapsulate rate_per_day variable
	public int getRate(){
		return rate_per_day;
	}
}