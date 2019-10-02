import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Scanner;
class Person{
	private String name;
	private GregorianCalendar birthd;

	// contructor
	// Person(){
	// 	name = "";
	// 	birthd = new GregorianCalendar();
	// }

	Person(String name, int y, int m, int d){
		this.name = name;
		birthd = new GregorianCalendar(y,m,d);
	}

	//accessor methods
	String getName(){
		return name;
	}
	String getbirthd(){
		return birthd.get(Calendar.YEAR) + "\\" + birthd.get(Calendar.MONTH) + "\\" + birthd.get(Calendar.DAY_OF_MONTH);
	}
}

class CollegeGraduate extends Person{
	private float gpa;
	private int yog;
	
	//contructor
	// CollegeGraduate(){
	// 	super();
	// 	gpa=0.f;
	// 	yog=0;
	// }

	CollegeGraduate(String name, int year, int month, int date, float gpa, int yog){
		super(name, year, month, date);
		this.gpa  = gpa;
		this.yog = yog;
	}

	float getGPA(){
		return gpa;
	}
	int getYearOfGrad(){
		return yog;
	}

	
}

class PersonDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CollegeGraduate cg;
		System.out.println("Enter the data: \n" + 
				"1. Name \n" + 
				"2. birthd \n" +
				"3. GPA \n" +
				"4. YearOfGraduation");
		cg = new CollegeGraduate(sc.nextLine(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextFloat(), sc.nextInt());
		
		System.out.println("Name: " + cg.getName()+ 
			"\nbirthd: " + cg.getbirthd() +
			"\nGPA: " + cg.getGPA() +
			"\nYearOfGraduation: " + cg.getYearOfGrad());
	}
}