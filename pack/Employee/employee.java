package pack.Employee;

public class employee{
	int emp_ID;
	String name;

	public employee(String name, int emp_ID){
		this.emp_ID = emp_ID;
		this.name = name;
	}

	//method to display the output
	public void display(){
		System.out.println("Employee Name : " + name);
		System.out.println("Employee ID : " + emp_ID);
	}
}