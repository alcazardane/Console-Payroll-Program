package pack.Utility;

interface calculations_interface{
	void grossCalculation(int rate, int work_frequency);
	int getGrossSalary();
	void deductionCalculation(int gross);
	int getPhilHealthDeduction();
	int getPagIbigDeduction();
	int getSSSDeduction();
	int getTotalDeduction();
	void netCalculation(int gross, int deduction);
	int getNetSalary();
}

abstract class calculations_abstract implements calculations_interface{}

class calculations extends calculations_abstract{
	int gross, total_deduction, net_salary;
	int deduct_philhealth, deduct_pagibig, deduct_sss;

	public calculations(int rate, int work_frequency){
		grossCalculation(rate, work_frequency);
		deductionCalculation(gross);
		netCalculation(gross, total_deduction);
	}

	//method for calculating gross salary
	public void grossCalculation(int rate, int work_frequency){
		gross = work_frequency * rate;
	}

	//method to encapsulate the gross variable
	public int getGrossSalary(){
		return gross;
	}

	//method to calculate salary deductions
	public void deductionCalculation(int gross){
		double a = gross * 0.05;
		deduct_philhealth = (int) a;
		double b = gross * 0.02;
		deduct_pagibig = (int) b;
		double c = gross * 0.03;
		deduct_sss = (int) c;
		total_deduction = deduct_philhealth + deduct_pagibig + deduct_sss;
	}

	//method to encapsulate the deduct_philhealth variable
	public int getPhilHealthDeduction(){
		return deduct_philhealth;
	}

	//method to encapsulate the deduct_pagibig variable
	public int getPagIbigDeduction(){
		return deduct_pagibig;
	}

	//method to encapsulate the deduct_sss variable
	public int getSSSDeduction(){
		return deduct_sss;
	}

	//method to encapsulate the total_deduction variable
	public int getTotalDeduction(){
		return total_deduction;
	}

	//method to calculate the net salary
	//by subtracting the salary deduction to the gross salary
	public void netCalculation(int gross, int deduction){
		net_salary = gross - deduction;
	}

	//mmethod to encapsulate the net_salary variable
	public int getNetSalary(){
		return net_salary;
	}
}