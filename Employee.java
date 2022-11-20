class Employee extends Person{
	private double salary;
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	Employee(int id, String name, String bloodGroup, double salary){
		super(id, name, bloodGroup);
		this.salary  = salary;
	}
		
	void showInfo(){
		super.showInfo();
		System.out.println("Salary: " + salary + "\n"); 
	}
}