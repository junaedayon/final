// class Student extends Person{
// 	private double cgpa;
	
// 	public double getCgpa(){
// 		return this.cgpa;
// 	}
	
// 	public void setCgpa(double cgpa){
// 		this.cgpa = cgpa;
// 	}
	
// 	Student(){
// 		super(45);
// 		System.out.println("S-D");
// 	}
	
// 	Student(int a){
// 		super(a);
// 		System.out.println("S-ND " + a);
// 	}
	
// 	Student(int id, String name, String bloodGroup, double cgpa){
// 		super(id,name,bloodGroup);
// 		System.out.println("S-NDO");
// 		this.cgpa = cgpa;
// 	}
	
// 	void showInfo(){
// 		super.showInfo();
// 		System.out.println("Cgpa: " + cgpa + "\n"); 
// 	}
// }

class Student extends Person{
	private double cgpa;

	public void setCgpa (double cgpa){
		this.cgpa = cgpa;
	}

	public double getCgpa(){
		return this.cgpa;
	}

	Student(){
		super(45);
		System.out.println("Ami Valo na");
	}

	Student(int a){
        super(a);
        System.out.println(a);
        System.out.println("U soho da ");

	}

	Student(int id , String name , String bloodGroup , double cgpa){
		super(id,name,bloodGroup);
		this.cgpa = cgpa;
		System.out.println("Good Stuff" );

	}

	void showInfo(){
       super.showInfo();
		System.out.println("Cgpa : " + cgpa);

	}
}













